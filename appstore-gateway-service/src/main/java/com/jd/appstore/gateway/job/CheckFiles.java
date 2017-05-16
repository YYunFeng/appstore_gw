package com.jd.appstore.gateway.job;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by YYF on 2014/10/30.
 */
public class CheckFiles {

    public static void main(String args[]) throws IOException {
        try {
            File file = new File("C:\\Users\\YYF\\Desktop\\林少洪\\11月22号");
            File[] lf = file.listFiles();
            String dir = "C:\\Users\\YYF\\Desktop\\林少洪\\11月22号";
            int counts = 0;

            File salersLogDir = new File("F://salerLogException");
            File uploadFile = new File(salersLogDir, "all");
            OutputStream out = new FileOutputStream(uploadFile);

            if (!salersLogDir.exists() || !salersLogDir.isDirectory()) {
                salersLogDir.mkdir();
            }

            int n = 0;
            for (int i = 0; i < lf.length; i++) {
                File logFile = new File(dir + "/" + lf[i].getName());
                // 开始读取文件内容
                if (logFile.exists() && logFile.isFile()) {
                    BufferedReader br = null;
                    try {
                        br = new BufferedReader(new InputStreamReader(new FileInputStream(logFile), "UTF-8"));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (UnsupportedEncodingException ex) {
                        ex.printStackTrace();
                    }

                    String line = "";
                    String a = "";
                    String b = "";
                    try {
                        InputStream in = new FileInputStream(logFile);
                        boolean flag = false;
                        while ((line = br.readLine()) != null) {
                            String[] logs = line.split(",");
                            int length = logs.length;
                            // 首先判断日志的长度，如果不为17则为错误
                            if (length != 17) {
                                continue;
                            }
                            if (length == 17) {  // 总共17个字段，取前16个字段，最后一个为APK验证码，不入库。
                                for (int j = 0; j < 16; j++) {
                                    if (null == logs[j] || logs[j].equals("null") || logs[j].equals("")) {
                                        if (logs[1] == "1" || logs[1].equals("1")) {
                                            break;
                                        } else {
                                            n = n + 1;
                                            BufferedWriter writer;
                                            try {
                                                writer = new BufferedWriter(new FileWriter(new File("F://salerLogException//all"), true));
                                                writer.write(line);
                                                writer.write("\r\n");
                                                writer.flush();
                                                writer.close();
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }

                                        }
                                    }
                                }
                            }
                        }

                       /* // 如果文件有问题，将文件copy出来;
                        if (!flag) {
                            counts = counts + 1;
                            File salersLogDir = new File("F://salerLogException");
                            if (!salersLogDir.exists() || !salersLogDir.isDirectory()) {
                                salersLogDir.mkdir();
                            }
                            File uploadFile = new File(salersLogDir, lf[i].getName() + a + b);
                            OutputStream out = new FileOutputStream(uploadFile);
                            byte[] buffer = new byte[1024 * 1024];
                            int lengthTemp;
                            while ((lengthTemp = in.read(buffer)) > 0) {
                                out.write(buffer, 0, lengthTemp);
                            }
                            in.close();
                            out.close();
                        }*/
                        in.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
            out.close();


            String a = null;
            Set<String> s = new HashSet<String>();
            for (int i = 0; i < 10; i++) {
                a = new String();
                s.add(a);

            }


            System.out.println("counts--->" + counts);
            System.out.println("counts--->" + n);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
