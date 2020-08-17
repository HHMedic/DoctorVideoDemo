package com.hhmedic.android.hhdoctorvideodemo.activity;

import android.content.Context;
import android.content.SharedPreferences;

import com.hhmedic.android.hhdoctorvideodemo.application.SharedPreferenceUtils;


public class LocalConfig {

    private static final String KEY = "isDevelop";
    private static final String USER_TOKEN = "user_token";
    private static final String PID = "pid";
    private static final String CAN_ADD_MEMBER = "can_add_member";

    static final String DefaultUserToken = "8DC2FD1D49451309DF7123716BFF20843F0D04F68EA2608F6783B874E4F50EEF";
    static final String DefaultCallOrderId = "1559198060885";
    static final String DefaultMedicineOrderId = "Y2019053014434215200";

    static void setDevelop(Context context, Boolean isDevelop) {
        SharedPreferenceUtils.setValue(context,KEY,isDevelop);
    }

    public static Boolean isDevelop(Context context) {
        return SharedPreferenceUtils.getBooleanValue(context,KEY,true);
    }

    static void setLoginedToken(Context context, String token) {
        SharedPreferenceUtils.setValue(context,USER_TOKEN,token);
    }

    static String getLoginedToken(Context context) {
        return SharedPreferenceUtils.getStringValue(context,USER_TOKEN);
    }

    public static void setPid(Context context,String pid) {
        SharedPreferenceUtils.setValue(context,PID,pid);
    }

    public static String getPid(Context context) {
        return SharedPreferenceUtils.getStringValue(context,PID);
    }

    public static void setCanAddMember(Context context,Boolean canAddMember) {
        SharedPreferenceUtils.setValue(context,CAN_ADD_MEMBER,canAddMember);
    }

    public static Boolean getCanAddMember(Context context) {
        return SharedPreferenceUtils.getBooleanValue(context,CAN_ADD_MEMBER, true);
    }
}
