package cn.telecom;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;

/**
 * @author lihaiyu
 */
public class DemoMain{

    public static void main(String[] args) {
        Pinyin4jUtils pinYinTool = new Pinyin4jUtils();

        System.out.println("/***********************汉字转拼音***********************/");
        // pin4j 简码 和 城市编码
        String str = "黎海育";
        System.out.println("输入字符串："+str);

        String[] headArray = Pinyin4jUtils.getHeadByString(str); // 获得每个汉字拼音首字母
        System.out.println("获取拼音字符串："+Pinyin4jUtils.hanziToPinyin(str,""));
        System.out.println("获取大写首字母："+Arrays.toString(headArray));
        System.out.println("获取字符串列表："+Arrays.toString(Pinyin4jUtils.stringToPinyin(str)));

        // System.out.println(Arrays.toString(Pinyin4jUtils.stringToPinyin(str,false,",")));
        // System.out.println(Arrays.toString(Pinyin4jUtils.stringToPinyin(str,false,",")));

        System.out.println("/***********************Loger4日志***********************/");
        Log log = LogFactory.getLog(DemoMain.class);

        String test="sdibt";
        log.info("this is info:"+test);
        log.error("this is error:"+test);
        log.debug("this is debug:"+test);
    }
}


