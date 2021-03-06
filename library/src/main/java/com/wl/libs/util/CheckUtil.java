package com.wl.libs.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wanglei on 16/7/1.
 */
public class CheckUtil {

    /**
     * 电话号码校验
     *
     * @author wanglei
     * @date 16/7/1 10:55
     */
    public static boolean checkPhoneNum(String phone) {
        String phone_regular_expressions = "^1[0-9]{10}$";
        Pattern pattern = Pattern.compile(phone_regular_expressions);
        Matcher matcher = pattern.matcher(phone);
        boolean re = matcher.matches();

        return re;
    }

    /**
     * 邮件校验
     *
     * @author wanglei
     * @date 16/7/1 10:55
     */
    public static boolean checkMail(String mail) {
        String mailRegular = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
        Pattern pattern = Pattern.compile(mailRegular);
        Matcher matcher = pattern.matcher(mail);
        boolean re = matcher.matches();

        return re;
    }

    /**
     * 省份证校验
     *
     * @author wanglei
     * @date 16/7/1 10:55
     */
    public static boolean checkIdentityCard(String idCard) {
        String idRegular = "^(\\d{15}$|^\\d{18}$|^\\d{17}(\\d|X|x))$";
        Pattern pattern = Pattern.compile(idRegular);
        Matcher matcher = pattern.matcher(idCard);
        boolean re = matcher.matches();

        return re;
    }

    /**
     * 校验车牌号码
     *
     * @author wanglei
     * @date 16/7/5 08:34
     */
    public static boolean checkCarNo(String carNo) {
        String carNoRegular = "^[\\u4e00-\\u9fa5]{1}[a-z_A-Z]{1}[a-z_A-Z_0-9]{5}$";
        Pattern pattern = Pattern.compile(carNoRegular);
        Matcher matcher = pattern.matcher(carNo);
        boolean re = matcher.matches();
        return re;
    }
}
