package com.danjdt.pdfviewer.itemdecoration.utils;

import android.content.Context;

public class ScreenUtils {
    public static int dp2px(Context context, int dpValue) {
        int density = (int) context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * density + 0.5f);
    }
}
