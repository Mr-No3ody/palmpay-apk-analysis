package com.transsnet.palmpay.core.bean;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CalendarEvent {
    public String cbId;
    public List<CalendarBean> data;
    public String fnName;

    public static class CalendarBean {
        public long beginTimeMillis;
        public String description;
        public long endTimeMillis;
        public int flag;
        public String title;
    }
}
