package com.jd.appstore.gateway.domain.util;

import org.apache.commons.lang.StringUtils;

import java.io.*;
import java.util.Date;
import java.util.Random;


/**
 * 功能描述：创建TXT文件并进行读、写、修改操作
 */
public class ReadWriteFile {
    public static BufferedReader bufread;
    //指定文件路径和名称
    private static String path = "F:/suncity.txt";
    private static File filename = new File(path);
    private static String readStr = "";


    /**
     * 创建文本文件.
     *
     * @throws IOException
     */
    public static void creatTxtFile() throws IOException {
        if (!filename.exists()) {
            filename.createNewFile();
            System.err.println(filename + "已创建！");
        }
    }

    /**
     * 读取文本文件.
     */
    public static String readTxtFile() {
        String read;
        FileReader fileread;
        try {
            fileread = new FileReader(filename);
            bufread = new BufferedReader(fileread);
            try {
                while ((read = bufread.readLine()) != null) {
                    readStr = readStr + read + "\r\n";
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("文件内容是:" + "\r\n" + readStr);
        return readStr;
    }

    /**
     * 生成促销员日志文件
     *
     * @param salerNo 促销员唯一号
     * @param counts  需要生成多少条数
     * @throws IOException
     */
    public static void writeTxtFile(Integer salerNo, Integer counts) throws IOException {
        //先读取原有文件内容，然后进行写入操作
        RandomAccessFile mm = null;
        StringBuffer stringBuffer = new StringBuffer();
        String phoneImei = phoneImei();
        Integer appid[] = {50000758,
                50000639,
                50000615,
                50000827,
                50000620,
                50000774,
                50000645,
                50000804,
                50000837,
                50000839,
                50000789,
                50000792,
                50000825,
                50000831,
                50000832,
                50000833,
                50000835,
                50000641,
                50000838,
                50000836,
                50000702,
                50000611};
        int j = 0;
        try {
            if (salerNo != null) {
                // 循环的日志条数
                for (int i = 0; i < counts; i++) {
                    stringBuffer.append("860483022618943,");
                    stringBuffer.append(salerNo + ",");
                    stringBuffer.append("王瑜,");
                    stringBuffer.append(salerNo + ",");
                    stringBuffer.append("宿州路国网新华书店手机卖场,");
                    stringBuffer.append("157,");
                    if (i % 22 == 0) { // 能被整除
                        phoneImei = phoneImei();
                        j = 0;
                    }
                    stringBuffer.append(phoneImei + ",");
                    stringBuffer.append("Android 4.2,Hisense,HS-U980,0,0,");
                    stringBuffer.append(appid[j] + ",");
                    stringBuffer.append("0,157,20141206,FFFFB8F2341DF153E926BF00D65DDED500A513D401CA22F1A449359EA304919E\n");
                    j = j + 1;
                }
            }
            mm = new RandomAccessFile(filename, "rw");
            byte data[] = stringBuffer.toString().getBytes("utf-8");
            mm.write(data);
            mm.seek(0);
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if (mm != null) {
                try {
                    mm.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /**
     * 将文件中指定内容的第一行替换为其它内容.
     *
     * @param oldStr     查找内容
     * @param replaceStr 替换内容
     */
    public static void replaceTxtByStr(String oldStr, String replaceStr) {
        String temp = "";
        try {
            File file = new File(path);
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            StringBuffer buf = new StringBuffer();

            // 保存该行前面的内容
            for (int j = 1; (temp = br.readLine()) != null
                    && !temp.equals(oldStr); j++) {
                buf = buf.append(temp);
                buf = buf.append(System.getProperty("line.separator"));
            }

            // 将内容插入
            buf = buf.append(replaceStr);

            // 保存该行后面的内容
            while ((temp = br.readLine()) != null) {
                buf = buf.append(System.getProperty("line.separator"));
                buf = buf.append(temp);
            }

            br.close();
            FileOutputStream fos = new FileOutputStream(file);
            PrintWriter pw = new PrintWriter(fos);
            pw.write(buf.toString().toCharArray());
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * main方法测试
     *
     * @param s
     * @throws IOException
     */
    public static void main(String[] s) throws IOException {
        ReadWriteFile.creatTxtFile();
//        ReadWriteFile.writeTxtFile(5418531, 325);
        ReadWriteFile.writeCountApp();
    }


    public static String phoneImei() {
        StringBuffer str = new StringBuffer();
        try {
            Random random = new Random();
            for (int i = 0; i < 15; i++) {
                str.append(random.nextInt(10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str.toString();
    }


    /**
     * 生成促销员到达数据
     *
     * @throws IOException
     */
    public static void writeCountApp() throws IOException {
        //先读取原有文件内容，然后进行写入操作
        RandomAccessFile mm = null;
        StringBuffer stringBuffer = new StringBuffer();
        String phoneImei[] = {
                "075085891754452",
                "322262325694596",
                "953479322869341",
                "531219207439625",
                "615388421416153",
                "118651360712804",
                "379554076377626",
                "072106143571489",
                "280149499768169",
                "824833709074938",
                "517841995310176",
                "023704436355024",
                "383426731586043"
        };
        Integer appid[] = {50000758,
                50000639,
                50000615,
                50000827,
                50000620,
                50000774,
                50000645,
                50000804,
                50000837,
                50000839,
                50000789,
                50000792,
                50000825,
                50000831,
                50000832,
                50000833,
                50000835,
                50000641,
                50000838,
                50000836,
                50000702,
                50000611};
        try {

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < phoneImei.length; i++) {
                for (int j = 0; j < appid.length; j++) {
                    sb.append("insert into tb_count_app (phone_imei,appid,created )values");
                    sb.append("(" + phoneImei[i]);
                    sb.append("," + appid[j]);
                    sb.append(",now());\n");
                }
            }
            mm = new RandomAccessFile(filename, "rw");
            byte data[] = sb.toString().getBytes("utf-8");
            mm.write(data);
            mm.seek(0);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}
