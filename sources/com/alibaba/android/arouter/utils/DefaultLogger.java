package com.alibaba.android.arouter.utils;

import C0.G;
import android.util.Log;
import androidx.camera.video.u;
import com.alibaba.android.arouter.facade.template.ILogger;

/* JADX INFO: loaded from: classes.dex */
public class DefaultLogger implements ILogger {
    private static boolean isMonitorMode = false;
    private static boolean isShowLog = false;
    private static boolean isShowStackTrace = false;
    private String defaultTag;

    public DefaultLogger() {
        this.defaultTag = Consts.SDK_NAME;
    }

    public static String getExtInfo(StackTraceElement stackTraceElement) {
        if (!isShowStackTrace) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder("[ThreadId=");
        String name = Thread.currentThread().getName();
        String fileName = stackTraceElement.getFileName();
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        long id2 = Thread.currentThread().getId();
        int lineNumber = stackTraceElement.getLineNumber();
        sb2.append(id2);
        sb2.append(" & ThreadName=");
        u.x(sb2, name, " & FileName=", fileName, " & ClassName=");
        u.x(sb2, className, " & MethodName=", methodName, " & LineNumber=");
        return G.n(lineNumber, " ] ", sb2);
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void debug(String str, String str2) {
        if (isShowLog) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (android.text.TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            getExtInfo(stackTraceElement);
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void error(String str, String str2) {
        if (isShowLog) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (android.text.TextUtils.isEmpty(str)) {
                str = getDefaultTag();
            }
            StringBuilder sbS = u.s(str2);
            sbS.append(getExtInfo(stackTraceElement));
            Log.e(str, sbS.toString());
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public String getDefaultTag() {
        return this.defaultTag;
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void info(String str, String str2) {
        if (isShowLog) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (android.text.TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            getExtInfo(stackTraceElement);
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public boolean isMonitorMode() {
        return isMonitorMode;
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void monitor(String str) {
        if (isShowLog && isMonitorMode()) {
            getExtInfo(Thread.currentThread().getStackTrace()[3]);
        }
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void showLog(boolean z3) {
        isShowLog = z3;
    }

    public void showMonitor(boolean z3) {
        isMonitorMode = z3;
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void showStackTrace(boolean z3) {
        isShowStackTrace = z3;
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void warning(String str, String str2) {
        if (isShowLog) {
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
            if (android.text.TextUtils.isEmpty(str)) {
                getDefaultTag();
            }
            getExtInfo(stackTraceElement);
        }
    }

    public DefaultLogger(String str) {
        this.defaultTag = str;
    }

    @Override // com.alibaba.android.arouter.facade.template.ILogger
    public void error(String str, String str2, Throwable th) {
        if (isShowLog) {
            if (android.text.TextUtils.isEmpty(str)) {
                str = getDefaultTag();
            }
            Log.e(str, str2, th);
        }
    }
}
