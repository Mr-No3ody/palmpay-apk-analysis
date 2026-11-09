package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzit implements Callable {
    final /* synthetic */ zzbh zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzjd zzc;

    public zzit(zzjd zzjdVar, zzbh zzbhVar, String str) {
        this.zza = zzbhVar;
        this.zzb = str;
        Objects.requireNonNull(zzjdVar);
        this.zzc = zzjdVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0363 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x016a, B:52:0x0171, B:54:0x0183, B:56:0x0189, B:58:0x0193, B:59:0x01a4, B:61:0x01a8, B:63:0x01b3, B:53:0x017a, B:66:0x01d3, B:67:0x0204, B:69:0x020c, B:71:0x0212, B:75:0x022d, B:77:0x0237, B:78:0x0244, B:79:0x0256, B:81:0x025c, B:88:0x0275, B:91:0x029a, B:92:0x02a1, B:94:0x02a7, B:95:0x02db, B:97:0x0342, B:98:0x0356, B:100:0x0363, B:103:0x03bc, B:104:0x03fa, B:106:0x0400, B:108:0x0411, B:109:0x041c, B:111:0x0462, B:112:0x0470, B:114:0x0478, B:115:0x047b, B:117:0x0483, B:120:0x048c, B:123:0x04a1, B:124:0x04a4, B:119:0x0489, B:102:0x039f, B:90:0x0279, B:130:0x0526), top: B:141:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x039f A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x016a, B:52:0x0171, B:54:0x0183, B:56:0x0189, B:58:0x0193, B:59:0x01a4, B:61:0x01a8, B:63:0x01b3, B:53:0x017a, B:66:0x01d3, B:67:0x0204, B:69:0x020c, B:71:0x0212, B:75:0x022d, B:77:0x0237, B:78:0x0244, B:79:0x0256, B:81:0x025c, B:88:0x0275, B:91:0x029a, B:92:0x02a1, B:94:0x02a7, B:95:0x02db, B:97:0x0342, B:98:0x0356, B:100:0x0363, B:103:0x03bc, B:104:0x03fa, B:106:0x0400, B:108:0x0411, B:109:0x041c, B:111:0x0462, B:112:0x0470, B:114:0x0478, B:115:0x047b, B:117:0x0483, B:120:0x048c, B:123:0x04a1, B:124:0x04a4, B:119:0x0489, B:102:0x039f, B:90:0x0279, B:130:0x0526), top: B:141:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0400 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x016a, B:52:0x0171, B:54:0x0183, B:56:0x0189, B:58:0x0193, B:59:0x01a4, B:61:0x01a8, B:63:0x01b3, B:53:0x017a, B:66:0x01d3, B:67:0x0204, B:69:0x020c, B:71:0x0212, B:75:0x022d, B:77:0x0237, B:78:0x0244, B:79:0x0256, B:81:0x025c, B:88:0x0275, B:91:0x029a, B:92:0x02a1, B:94:0x02a7, B:95:0x02db, B:97:0x0342, B:98:0x0356, B:100:0x0363, B:103:0x03bc, B:104:0x03fa, B:106:0x0400, B:108:0x0411, B:109:0x041c, B:111:0x0462, B:112:0x0470, B:114:0x0478, B:115:0x047b, B:117:0x0483, B:120:0x048c, B:123:0x04a1, B:124:0x04a4, B:119:0x0489, B:102:0x039f, B:90:0x0279, B:130:0x0526), top: B:141:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0462 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x016a, B:52:0x0171, B:54:0x0183, B:56:0x0189, B:58:0x0193, B:59:0x01a4, B:61:0x01a8, B:63:0x01b3, B:53:0x017a, B:66:0x01d3, B:67:0x0204, B:69:0x020c, B:71:0x0212, B:75:0x022d, B:77:0x0237, B:78:0x0244, B:79:0x0256, B:81:0x025c, B:88:0x0275, B:91:0x029a, B:92:0x02a1, B:94:0x02a7, B:95:0x02db, B:97:0x0342, B:98:0x0356, B:100:0x0363, B:103:0x03bc, B:104:0x03fa, B:106:0x0400, B:108:0x0411, B:109:0x041c, B:111:0x0462, B:112:0x0470, B:114:0x0478, B:115:0x047b, B:117:0x0483, B:120:0x048c, B:123:0x04a1, B:124:0x04a4, B:119:0x0489, B:102:0x039f, B:90:0x0279, B:130:0x0526), top: B:141:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x0478 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x016a, B:52:0x0171, B:54:0x0183, B:56:0x0189, B:58:0x0193, B:59:0x01a4, B:61:0x01a8, B:63:0x01b3, B:53:0x017a, B:66:0x01d3, B:67:0x0204, B:69:0x020c, B:71:0x0212, B:75:0x022d, B:77:0x0237, B:78:0x0244, B:79:0x0256, B:81:0x025c, B:88:0x0275, B:91:0x029a, B:92:0x02a1, B:94:0x02a7, B:95:0x02db, B:97:0x0342, B:98:0x0356, B:100:0x0363, B:103:0x03bc, B:104:0x03fa, B:106:0x0400, B:108:0x0411, B:109:0x041c, B:111:0x0462, B:112:0x0470, B:114:0x0478, B:115:0x047b, B:117:0x0483, B:120:0x048c, B:123:0x04a1, B:124:0x04a4, B:119:0x0489, B:102:0x039f, B:90:0x0279, B:130:0x0526), top: B:141:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0483 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x016a, B:52:0x0171, B:54:0x0183, B:56:0x0189, B:58:0x0193, B:59:0x01a4, B:61:0x01a8, B:63:0x01b3, B:53:0x017a, B:66:0x01d3, B:67:0x0204, B:69:0x020c, B:71:0x0212, B:75:0x022d, B:77:0x0237, B:78:0x0244, B:79:0x0256, B:81:0x025c, B:88:0x0275, B:91:0x029a, B:92:0x02a1, B:94:0x02a7, B:95:0x02db, B:97:0x0342, B:98:0x0356, B:100:0x0363, B:103:0x03bc, B:104:0x03fa, B:106:0x0400, B:108:0x0411, B:109:0x041c, B:111:0x0462, B:112:0x0470, B:114:0x0478, B:115:0x047b, B:117:0x0483, B:120:0x048c, B:123:0x04a1, B:124:0x04a4, B:119:0x0489, B:102:0x039f, B:90:0x0279, B:130:0x0526), top: B:141:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0487 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0489 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x016a, B:52:0x0171, B:54:0x0183, B:56:0x0189, B:58:0x0193, B:59:0x01a4, B:61:0x01a8, B:63:0x01b3, B:53:0x017a, B:66:0x01d3, B:67:0x0204, B:69:0x020c, B:71:0x0212, B:75:0x022d, B:77:0x0237, B:78:0x0244, B:79:0x0256, B:81:0x025c, B:88:0x0275, B:91:0x029a, B:92:0x02a1, B:94:0x02a7, B:95:0x02db, B:97:0x0342, B:98:0x0356, B:100:0x0363, B:103:0x03bc, B:104:0x03fa, B:106:0x0400, B:108:0x0411, B:109:0x041c, B:111:0x0462, B:112:0x0470, B:114:0x0478, B:115:0x047b, B:117:0x0483, B:120:0x048c, B:123:0x04a1, B:124:0x04a4, B:119:0x0489, B:102:0x039f, B:90:0x0279, B:130:0x0526), top: B:141:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x049f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:142:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x0411 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x03fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x01d3 A[Catch: all -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x016a, B:52:0x0171, B:54:0x0183, B:56:0x0189, B:58:0x0193, B:59:0x01a4, B:61:0x01a8, B:63:0x01b3, B:53:0x017a, B:66:0x01d3, B:67:0x0204, B:69:0x020c, B:71:0x0212, B:75:0x022d, B:77:0x0237, B:78:0x0244, B:79:0x0256, B:81:0x025c, B:88:0x0275, B:91:0x029a, B:92:0x02a1, B:94:0x02a7, B:95:0x02db, B:97:0x0342, B:98:0x0356, B:100:0x0363, B:103:0x03bc, B:104:0x03fa, B:106:0x0400, B:108:0x0411, B:109:0x041c, B:111:0x0462, B:112:0x0470, B:114:0x0478, B:115:0x047b, B:117:0x0483, B:120:0x048c, B:123:0x04a1, B:124:0x04a4, B:119:0x0489, B:102:0x039f, B:90:0x0279, B:130:0x0526), top: B:141:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x020c A[Catch: all -> 0x007b, SecurityException -> 0x022a, TryCatch #1 {SecurityException -> 0x022a, blocks: (B:67:0x0204, B:69:0x020c, B:71:0x0212), top: B:137:0x0204, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0237 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x016a, B:52:0x0171, B:54:0x0183, B:56:0x0189, B:58:0x0193, B:59:0x01a4, B:61:0x01a8, B:63:0x01b3, B:53:0x017a, B:66:0x01d3, B:67:0x0204, B:69:0x020c, B:71:0x0212, B:75:0x022d, B:77:0x0237, B:78:0x0244, B:79:0x0256, B:81:0x025c, B:88:0x0275, B:91:0x029a, B:92:0x02a1, B:94:0x02a7, B:95:0x02db, B:97:0x0342, B:98:0x0356, B:100:0x0363, B:103:0x03bc, B:104:0x03fa, B:106:0x0400, B:108:0x0411, B:109:0x041c, B:111:0x0462, B:112:0x0470, B:114:0x0478, B:115:0x047b, B:117:0x0483, B:120:0x048c, B:123:0x04a1, B:124:0x04a4, B:119:0x0489, B:102:0x039f, B:90:0x0279, B:130:0x0526), top: B:141:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x025c A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x016a, B:52:0x0171, B:54:0x0183, B:56:0x0189, B:58:0x0193, B:59:0x01a4, B:61:0x01a8, B:63:0x01b3, B:53:0x017a, B:66:0x01d3, B:67:0x0204, B:69:0x020c, B:71:0x0212, B:75:0x022d, B:77:0x0237, B:78:0x0244, B:79:0x0256, B:81:0x025c, B:88:0x0275, B:91:0x029a, B:92:0x02a1, B:94:0x02a7, B:95:0x02db, B:97:0x0342, B:98:0x0356, B:100:0x0363, B:103:0x03bc, B:104:0x03fa, B:106:0x0400, B:108:0x0411, B:109:0x041c, B:111:0x0462, B:112:0x0470, B:114:0x0478, B:115:0x047b, B:117:0x0483, B:120:0x048c, B:123:0x04a1, B:124:0x04a4, B:119:0x0489, B:102:0x039f, B:90:0x0279, B:130:0x0526), top: B:141:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0275 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x016a, B:52:0x0171, B:54:0x0183, B:56:0x0189, B:58:0x0193, B:59:0x01a4, B:61:0x01a8, B:63:0x01b3, B:53:0x017a, B:66:0x01d3, B:67:0x0204, B:69:0x020c, B:71:0x0212, B:75:0x022d, B:77:0x0237, B:78:0x0244, B:79:0x0256, B:81:0x025c, B:88:0x0275, B:91:0x029a, B:92:0x02a1, B:94:0x02a7, B:95:0x02db, B:97:0x0342, B:98:0x0356, B:100:0x0363, B:103:0x03bc, B:104:0x03fa, B:106:0x0400, B:108:0x0411, B:109:0x041c, B:111:0x0462, B:112:0x0470, B:114:0x0478, B:115:0x047b, B:117:0x0483, B:120:0x048c, B:123:0x04a1, B:124:0x04a4, B:119:0x0489, B:102:0x039f, B:90:0x0279, B:130:0x0526), top: B:141:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0279 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x016a, B:52:0x0171, B:54:0x0183, B:56:0x0189, B:58:0x0193, B:59:0x01a4, B:61:0x01a8, B:63:0x01b3, B:53:0x017a, B:66:0x01d3, B:67:0x0204, B:69:0x020c, B:71:0x0212, B:75:0x022d, B:77:0x0237, B:78:0x0244, B:79:0x0256, B:81:0x025c, B:88:0x0275, B:91:0x029a, B:92:0x02a1, B:94:0x02a7, B:95:0x02db, B:97:0x0342, B:98:0x0356, B:100:0x0363, B:103:0x03bc, B:104:0x03fa, B:106:0x0400, B:108:0x0411, B:109:0x041c, B:111:0x0462, B:112:0x0470, B:114:0x0478, B:115:0x047b, B:117:0x0483, B:120:0x048c, B:123:0x04a1, B:124:0x04a4, B:119:0x0489, B:102:0x039f, B:90:0x0279, B:130:0x0526), top: B:141:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x02a7 A[Catch: all -> 0x007b, LOOP:1: B:92:0x02a1->B:94:0x02a7, LOOP_END, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x016a, B:52:0x0171, B:54:0x0183, B:56:0x0189, B:58:0x0193, B:59:0x01a4, B:61:0x01a8, B:63:0x01b3, B:53:0x017a, B:66:0x01d3, B:67:0x0204, B:69:0x020c, B:71:0x0212, B:75:0x022d, B:77:0x0237, B:78:0x0244, B:79:0x0256, B:81:0x025c, B:88:0x0275, B:91:0x029a, B:92:0x02a1, B:94:0x02a7, B:95:0x02db, B:97:0x0342, B:98:0x0356, B:100:0x0363, B:103:0x03bc, B:104:0x03fa, B:106:0x0400, B:108:0x0411, B:109:0x041c, B:111:0x0462, B:112:0x0470, B:114:0x0478, B:115:0x047b, B:117:0x0483, B:120:0x048c, B:123:0x04a1, B:124:0x04a4, B:119:0x0489, B:102:0x039f, B:90:0x0279, B:130:0x0526), top: B:141:0x0057, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0342 A[Catch: all -> 0x007b, TryCatch #3 {all -> 0x007b, blocks: (B:9:0x0057, B:11:0x0062, B:16:0x007e, B:18:0x0084, B:19:0x0096, B:21:0x00ad, B:22:0x00b4, B:24:0x00be, B:25:0x00cb, B:27:0x00d5, B:28:0x00e2, B:30:0x00ed, B:31:0x00f5, B:33:0x010d, B:34:0x0110, B:36:0x012a, B:38:0x013a, B:40:0x0142, B:42:0x0148, B:43:0x014b, B:45:0x015a, B:47:0x0160, B:49:0x016a, B:52:0x0171, B:54:0x0183, B:56:0x0189, B:58:0x0193, B:59:0x01a4, B:61:0x01a8, B:63:0x01b3, B:53:0x017a, B:66:0x01d3, B:67:0x0204, B:69:0x020c, B:71:0x0212, B:75:0x022d, B:77:0x0237, B:78:0x0244, B:79:0x0256, B:81:0x025c, B:88:0x0275, B:91:0x029a, B:92:0x02a1, B:94:0x02a7, B:95:0x02db, B:97:0x0342, B:98:0x0356, B:100:0x0363, B:103:0x03bc, B:104:0x03fa, B:106:0x0400, B:108:0x0411, B:109:0x041c, B:111:0x0462, B:112:0x0470, B:114:0x0478, B:115:0x047b, B:117:0x0483, B:120:0x048c, B:123:0x04a1, B:124:0x04a4, B:119:0x0489, B:102:0x039f, B:90:0x0279, B:130:0x0526), top: B:141:0x0057, inners: #0, #1 }] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        zzpg zzpgVar;
        String strZzc;
        zzpg zzpgVar2;
        List listZzn;
        Iterator it;
        zzpn zzpnVar;
        com.google.android.gms.internal.measurement.zziu[] zziuVarArr;
        int i7;
        zzpg zzpgVar3;
        zzic zzicVar;
        Bundle bundle;
        String str;
        String str2;
        zzbd zzbdVarZzf;
        zzpg zzpgVar4;
        com.google.android.gms.internal.measurement.zzhz zzhzVar;
        Bundle bundle2;
        String str3;
        Object obj;
        boolean z3;
        zzbd zzbdVarZza;
        long j6;
        com.google.android.gms.internal.measurement.zzhr zzhrVarZzp;
        zzbf zzbfVar;
        zzbe zzbeVar;
        long jZzp;
        long jZzn;
        String strZzh;
        com.google.android.gms.internal.measurement.zzhv zzhvVarZzn;
        Object objZza;
        byte[] bArr2;
        zzjd zzjdVar = this.zzc;
        zzjdVar.zzL().zzaa();
        zzlp zzlpVarZzn = zzjdVar.zzL().zzn();
        zzlpVarZzn.zzg();
        zzic zzicVar2 = zzlpVarZzn.zzu;
        zzic.zzL();
        zzbh zzbhVar = this.zza;
        Preconditions.checkNotNull(zzbhVar);
        String str4 = this.zzb;
        Preconditions.checkNotEmpty(str4);
        String str5 = zzbhVar.zza;
        if (!"_iap".equals(str5) && !"_iapx".equals(str5)) {
            zzlpVarZzn.zzu.zzaW().zzj().zzc("Generating a payload for this event is not available. package_name, event_name", str4, str5);
            return null;
        }
        zzpg zzpgVar5 = zzlpVarZzn.zzg;
        com.google.android.gms.internal.measurement.zzhz zzhzVarZzi = com.google.android.gms.internal.measurement.zzib.zzi();
        zzpgVar5.zzj().zzb();
        try {
            zzh zzhVarZzu = zzpgVar5.zzj().zzu(str4);
            if (zzhVarZzu == null) {
                zzlpVarZzn.zzu.zzaW().zzj().zzb("Log and bundle not available. package_name", str4);
                bArr2 = new byte[0];
            } else {
                if (zzhVarZzu.zzD()) {
                    com.google.android.gms.internal.measurement.zzic zzicVarZzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                    zzicVarZzaE.zza(1);
                    zzicVarZzaE.zzC("android");
                    if (!TextUtils.isEmpty(zzhVarZzu.zzc())) {
                        zzicVarZzaE.zzL(zzhVarZzu.zzc());
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzv())) {
                        zzicVarZzaE.zzJ((String) Preconditions.checkNotNull(zzhVarZzu.zzv()));
                    }
                    if (!TextUtils.isEmpty(zzhVarZzu.zzr())) {
                        zzicVarZzaE.zzM((String) Preconditions.checkNotNull(zzhVarZzu.zzr()));
                    }
                    if (zzhVarZzu.zzt() != -2147483648L) {
                        zzicVarZzaE.zzaj((int) zzhVarZzu.zzt());
                    }
                    zzicVarZzaE.zzN(zzhVarZzu.zzx());
                    zzicVarZzaE.zzar(zzhVarZzu.zzB());
                    String strZzf = zzhVarZzu.zzf();
                    if (!TextUtils.isEmpty(strZzf)) {
                        zzicVarZzaE.zzad(strZzf);
                    }
                    zzicVarZzaE.zzay(zzhVarZzu.zzak());
                    zzjl zzjlVarZzB = zzlpVarZzn.zzg.zzB(str4);
                    zzicVarZzaE.zzY(zzhVarZzu.zzz());
                    if (zzicVar2.zzB() && zzlpVarZzn.zzu.zzc().zzC(zzicVarZzaE.zzK()) && zzjlVarZzB.zzo(zzjk.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                        zzicVarZzaE.zzam(null);
                    }
                    zzicVarZzaE.zzat(zzjlVarZzB.zzk());
                    zzjk zzjkVar = zzjk.AD_STORAGE;
                    if (zzjlVarZzB.zzo(zzjkVar) && zzhVarZzu.zzac()) {
                        Pair pairZzd = (zzjlVarZzB.zzo(zzjkVar) && zzhVarZzu.zzac()) ? zzpgVar5.zzq().zzd(zzhVarZzu.zzc()) : new Pair("", Boolean.FALSE);
                        if (!zzhVarZzu.zzac() || TextUtils.isEmpty((CharSequence) pairZzd.first)) {
                            zzic zzicVar3 = zzlpVarZzn.zzu;
                            zzicVar3.zzu().zzw();
                            zzicVarZzaE.zzF(Build.MODEL);
                            zzicVar3.zzu().zzw();
                            zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                            zzicVarZzaE.zzI((int) zzicVar3.zzu().zzb());
                            zzicVarZzaE.zzH(zzicVar3.zzu().zzc());
                            if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE)) {
                                zzicVarZzaE.zzW(zzlp.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(zzbhVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpgVar2 = zzlpVarZzn.zzg;
                            listZzn = zzpgVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpnVar = null;
                                    break;
                                }
                                zzpnVar = (zzpn) it.next();
                            } while (!"_lte".equals(zzpnVar.zzc));
                            if (zzpnVar != null) {
                                zzpn zzpnVar2 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar2);
                                zzpgVar2.zzj().zzl(zzpnVar2);
                            } else {
                                zzpn zzpnVar3 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar3);
                                zzpgVar2.zzj().zzl(zzpnVar3);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            for (i7 = 0; i7 < listZzn.size(); i7++) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm.zzb(((zzpn) listZzn.get(i7)).zzc);
                                zzitVarZzm.zza(((zzpn) listZzn.get(i7)).zzd);
                                zzpgVar2.zzp().zzc(zzitVarZzm, ((zzpn) listZzn.get(i7)).zze);
                                zziuVarArr[i7] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm.zzbd();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            zzpgVar3 = zzlpVarZzn.zzg;
                            zzpgVar3.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpgVar3.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgv zzgvVarZza = zzgv.zza(zzbhVar);
                            zzicVar = zzlpVarZzn.zzu;
                            zzpp zzppVarZzk = zzicVar.zzk();
                            bundle = zzgvVarZza.zze;
                            zzppVarZzk.zzK(bundle, zzpgVar2.zzj().zzV(str4));
                            zzicVar.zzk().zzI(zzgvVarZza, zzicVar.zzc().zzd(str4));
                            bundle.putLong("_c", 1L);
                            zzicVar.zzaW().zzj().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = zzbhVar.zzc;
                            bundle.putString("_o", str);
                            if (zzicVar.zzk().zzad(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                zzicVar.zzk().zzO(bundle, "_dbg", 1L);
                                zzicVar.zzk().zzO(bundle, "_r", 1L);
                            }
                            zzaw zzawVarZzj = zzpgVar2.zzj();
                            str2 = zzbhVar.zza;
                            zzbdVarZzf = zzawVarZzj.zzf(str4, str2);
                            if (zzbdVarZzf == null) {
                                zzpgVar4 = zzpgVar3;
                                obj = null;
                                z3 = true;
                                zzhzVar = zzhzVarZzi;
                                str3 = str;
                                bundle2 = bundle;
                                zzbdVarZza = new zzbd(str4, str2, 0L, 0L, 0L, zzbhVar.zzd, 0L, null, null, null, null);
                                j6 = 0;
                            } else {
                                zzpgVar4 = zzpgVar3;
                                zzhzVar = zzhzVarZzi;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                z3 = true;
                                long j10 = zzbdVarZzf.zzf;
                                zzbdVarZza = zzbdVarZzf.zza(zzbhVar.zzd);
                                j6 = j10;
                            }
                            zzbd zzbdVar = zzbdVarZza;
                            zzpgVar2.zzj().zzh(zzbdVar);
                            zzpg zzpgVar6 = zzpgVar4;
                            boolean z8 = z3;
                            com.google.android.gms.internal.measurement.zzhz zzhzVar2 = zzhzVar;
                            zzbc zzbcVar = new zzbc(zzlpVarZzn.zzu, str3, str4, str2, zzbhVar.zzd, 0L, j6, bundle2);
                            zzhrVarZzp = com.google.android.gms.internal.measurement.zzhs.zzp();
                            zzhrVarZzp.zzo(zzbcVar.zzd);
                            zzhrVarZzp.zzl(zzbcVar.zzb);
                            zzhrVarZzp.zzq(zzbcVar.zzf);
                            zzbfVar = zzbcVar.zzg;
                            zzbeVar = new zzbe(zzbfVar);
                            while (zzbeVar.hasNext()) {
                                String next = zzbeVar.next();
                                zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb(next);
                                objZza = zzbfVar.zza(next);
                                if (objZza != null) {
                                    zzpgVar2.zzp().zzd(zzhvVarZzn, objZza);
                                    zzhrVarZzp.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzp);
                            com.google.android.gms.internal.measurement.zzie zzieVarZza = com.google.android.gms.internal.measurement.zzig.zza();
                            com.google.android.gms.internal.measurement.zzht zzhtVarZza = com.google.android.gms.internal.measurement.zzhu.zza();
                            zzhtVarZza.zzb(zzbdVar.zzc);
                            zzhtVarZza.zza(str2);
                            zzieVarZza.zza(zzhtVarZza);
                            zzicVarZzaE.zzap(zzieVarZza);
                            zzicVarZzaE.zzaf(zzpgVar2.zzm().zzb(zzhVarZzu.zzc(), Collections.EMPTY_LIST, zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzp.zzn()), Long.valueOf(zzhrVarZzp.zzn()), false));
                            if (zzhrVarZzp.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzp.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzp.zzn());
                            }
                            jZzp = zzhVarZzu.zzp();
                            if (jZzp != 0) {
                                zzicVarZzaE.zzA(jZzp);
                            }
                            jZzn = zzhVarZzu.zzn();
                            if (jZzn != 0) {
                                zzicVarZzaE.zzy(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarZzaE.zzy(jZzp);
                            }
                            strZzh = zzhVarZzu.zzh();
                            zzair.zza();
                            if (zzicVar.zzc().zzp(str4, zzfy.zzaM)) {
                                zzicVarZzaE.zzau(strZzh);
                            }
                            zzhVarZzu.zzL();
                            zzicVarZzaE.zzZ((int) zzhVarZzu.zzG());
                            zzicVar.zzc().zzi();
                            zzicVarZzaE.zzO(161000L);
                            zzicVarZzaE.zzs(zzicVar.zzba().currentTimeMillis());
                            zzicVarZzaE.zzae(z8);
                            zzpgVar6.zzS(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVar2.zze(zzicVarZzaE);
                            zzhVarZzu.zzo(zzicVarZzaE.zzu());
                            zzhVarZzu.zzq(zzicVarZzaE.zzw());
                            zzpgVar2.zzj().zzv(zzhVarZzu, false, false);
                            zzpgVar2.zzj().zzc();
                            zzpgVar2.zzj().zzd();
                            return zzpgVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar2.zzbd()).zzcd());
                        }
                        try {
                            zzicVarZzaE.zzQ(zzlp.zzc((String) pairZzd.first, Long.toString(zzbhVar.zzd)));
                            Object obj2 = pairZzd.second;
                            if (obj2 != null) {
                                zzicVarZzaE.zzT(((Boolean) obj2).booleanValue());
                            }
                            zzic zzicVar4 = zzlpVarZzn.zzu;
                            zzicVar4.zzu().zzw();
                            zzicVarZzaE.zzF(Build.MODEL);
                            zzicVar4.zzu().zzw();
                            zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                            zzicVarZzaE.zzI((int) zzicVar4.zzu().zzb());
                            zzicVarZzaE.zzH(zzicVar4.zzu().zzc());
                            if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE)) {
                                zzicVarZzaE.zzW(zzlp.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(zzbhVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpgVar2 = zzlpVarZzn.zzg;
                            listZzn = zzpgVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpnVar = null;
                                    break;
                                }
                                zzpnVar = (zzpn) it.next();
                            } while (!"_lte".equals(zzpnVar.zzc));
                            if (zzpnVar != null) {
                                zzpn zzpnVar4 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar4);
                                zzpgVar2.zzj().zzl(zzpnVar4);
                            } else {
                                zzpn zzpnVar5 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar5);
                                zzpgVar2.zzj().zzl(zzpnVar5);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            while (i7 < listZzn.size()) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm2 = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm2.zzb(((zzpn) listZzn.get(i7)).zzc);
                                zzitVarZzm2.zza(((zzpn) listZzn.get(i7)).zzd);
                                zzpgVar2.zzp().zzc(zzitVarZzm2, ((zzpn) listZzn.get(i7)).zze);
                                zziuVarArr[i7] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm2.zzbd();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            zzpgVar3 = zzlpVarZzn.zzg;
                            zzpgVar3.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpgVar3.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgv zzgvVarZza2 = zzgv.zza(zzbhVar);
                            zzicVar = zzlpVarZzn.zzu;
                            zzpp zzppVarZzk2 = zzicVar.zzk();
                            bundle = zzgvVarZza2.zze;
                            zzppVarZzk2.zzK(bundle, zzpgVar2.zzj().zzV(str4));
                            zzicVar.zzk().zzI(zzgvVarZza2, zzicVar.zzc().zzd(str4));
                            bundle.putLong("_c", 1L);
                            zzicVar.zzaW().zzj().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = zzbhVar.zzc;
                            bundle.putString("_o", str);
                            if (zzicVar.zzk().zzad(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                zzicVar.zzk().zzO(bundle, "_dbg", 1L);
                                zzicVar.zzk().zzO(bundle, "_r", 1L);
                            }
                            zzaw zzawVarZzj2 = zzpgVar2.zzj();
                            str2 = zzbhVar.zza;
                            zzbdVarZzf = zzawVarZzj2.zzf(str4, str2);
                            if (zzbdVarZzf == null) {
                                zzpgVar4 = zzpgVar3;
                                obj = null;
                                z3 = true;
                                zzhzVar = zzhzVarZzi;
                                str3 = str;
                                bundle2 = bundle;
                                zzbdVarZza = new zzbd(str4, str2, 0L, 0L, 0L, zzbhVar.zzd, 0L, null, null, null, null);
                                j6 = 0;
                            } else {
                                zzpgVar4 = zzpgVar3;
                                zzhzVar = zzhzVarZzi;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                z3 = true;
                                long j11 = zzbdVarZzf.zzf;
                                zzbdVarZza = zzbdVarZzf.zza(zzbhVar.zzd);
                                j6 = j11;
                            }
                            zzbd zzbdVar2 = zzbdVarZza;
                            zzpgVar2.zzj().zzh(zzbdVar2);
                            zzpg zzpgVar7 = zzpgVar4;
                            boolean z10 = z3;
                            com.google.android.gms.internal.measurement.zzhz zzhzVar3 = zzhzVar;
                            zzbc zzbcVar2 = new zzbc(zzlpVarZzn.zzu, str3, str4, str2, zzbhVar.zzd, 0L, j6, bundle2);
                            zzhrVarZzp = com.google.android.gms.internal.measurement.zzhs.zzp();
                            zzhrVarZzp.zzo(zzbcVar2.zzd);
                            zzhrVarZzp.zzl(zzbcVar2.zzb);
                            zzhrVarZzp.zzq(zzbcVar2.zzf);
                            zzbfVar = zzbcVar2.zzg;
                            zzbeVar = new zzbe(zzbfVar);
                            while (zzbeVar.hasNext()) {
                                String next2 = zzbeVar.next();
                                zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb(next2);
                                objZza = zzbfVar.zza(next2);
                                if (objZza != null) {
                                    zzpgVar2.zzp().zzd(zzhvVarZzn, objZza);
                                    zzhrVarZzp.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzp);
                            com.google.android.gms.internal.measurement.zzie zzieVarZza2 = com.google.android.gms.internal.measurement.zzig.zza();
                            com.google.android.gms.internal.measurement.zzht zzhtVarZza2 = com.google.android.gms.internal.measurement.zzhu.zza();
                            zzhtVarZza2.zzb(zzbdVar2.zzc);
                            zzhtVarZza2.zza(str2);
                            zzieVarZza2.zza(zzhtVarZza2);
                            zzicVarZzaE.zzap(zzieVarZza2);
                            zzicVarZzaE.zzaf(zzpgVar2.zzm().zzb(zzhVarZzu.zzc(), Collections.EMPTY_LIST, zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzp.zzn()), Long.valueOf(zzhrVarZzp.zzn()), false));
                            if (zzhrVarZzp.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzp.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzp.zzn());
                            }
                            jZzp = zzhVarZzu.zzp();
                            if (jZzp != 0) {
                                zzicVarZzaE.zzA(jZzp);
                            }
                            jZzn = zzhVarZzu.zzn();
                            if (jZzn != 0) {
                                zzicVarZzaE.zzy(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarZzaE.zzy(jZzp);
                            }
                            strZzh = zzhVarZzu.zzh();
                            zzair.zza();
                            if (zzicVar.zzc().zzp(str4, zzfy.zzaM)) {
                                zzicVarZzaE.zzau(strZzh);
                            }
                            zzhVarZzu.zzL();
                            zzicVarZzaE.zzZ((int) zzhVarZzu.zzG());
                            zzicVar.zzc().zzi();
                            zzicVarZzaE.zzO(161000L);
                            zzicVarZzaE.zzs(zzicVar.zzba().currentTimeMillis());
                            zzicVarZzaE.zzae(z10);
                            zzpgVar7.zzS(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVar3.zze(zzicVarZzaE);
                            zzhVarZzu.zzo(zzicVarZzaE.zzu());
                            zzhVarZzu.zzq(zzicVarZzaE.zzw());
                            zzpgVar2.zzj().zzv(zzhVarZzu, false, false);
                            zzpgVar2.zzj().zzc();
                            zzpgVar2.zzj().zzd();
                            return zzpgVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar3.zzbd()).zzcd());
                        } catch (SecurityException e10) {
                            zzlpVarZzn.zzu.zzaW().zzj().zzb("Resettable device id encryption failed", e10.getMessage());
                            bArr = new byte[0];
                            zzpgVar = zzlpVarZzn.zzg;
                        }
                    } else {
                        zzic zzicVar5 = zzlpVarZzn.zzu;
                        zzicVar5.zzu().zzw();
                        zzicVarZzaE.zzF(Build.MODEL);
                        zzicVar5.zzu().zzw();
                        zzicVarZzaE.zzE(Build.VERSION.RELEASE);
                        zzicVarZzaE.zzI((int) zzicVar5.zzu().zzb());
                        zzicVarZzaE.zzH(zzicVar5.zzu().zzc());
                        try {
                            if (zzjlVarZzB.zzo(zzjk.ANALYTICS_STORAGE) && zzhVarZzu.zzd() != null) {
                                zzicVarZzaE.zzW(zzlp.zzc((String) Preconditions.checkNotNull(zzhVarZzu.zzd()), Long.toString(zzbhVar.zzd)));
                            }
                            if (!TextUtils.isEmpty(zzhVarZzu.zzl())) {
                                zzicVarZzaE.zzah((String) Preconditions.checkNotNull(zzhVarZzu.zzl()));
                            }
                            strZzc = zzhVarZzu.zzc();
                            zzpgVar2 = zzlpVarZzn.zzg;
                            listZzn = zzpgVar2.zzj().zzn(strZzc);
                            it = listZzn.iterator();
                            do {
                                if (!it.hasNext()) {
                                    zzpnVar = null;
                                    break;
                                }
                                zzpnVar = (zzpn) it.next();
                            } while (!"_lte".equals(zzpnVar.zzc));
                            if (zzpnVar != null || zzpnVar.zze == null) {
                                zzpn zzpnVar6 = new zzpn(strZzc, "auto", "_lte", zzlpVarZzn.zzu.zzba().currentTimeMillis(), 0L);
                                listZzn.add(zzpnVar6);
                                zzpgVar2.zzj().zzl(zzpnVar6);
                            }
                            zziuVarArr = new com.google.android.gms.internal.measurement.zziu[listZzn.size()];
                            while (i7 < listZzn.size()) {
                                com.google.android.gms.internal.measurement.zzit zzitVarZzm3 = com.google.android.gms.internal.measurement.zziu.zzm();
                                zzitVarZzm3.zzb(((zzpn) listZzn.get(i7)).zzc);
                                zzitVarZzm3.zza(((zzpn) listZzn.get(i7)).zzd);
                                zzpgVar2.zzp().zzc(zzitVarZzm3, ((zzpn) listZzn.get(i7)).zze);
                                zziuVarArr[i7] = (com.google.android.gms.internal.measurement.zziu) zzitVarZzm3.zzbd();
                            }
                            zzicVarZzaE.zzq(Arrays.asList(zziuVarArr));
                            zzpgVar3 = zzlpVarZzn.zzg;
                            zzpgVar3.zzI(zzhVarZzu, zzicVarZzaE);
                            zzpgVar3.zzJ(zzhVarZzu, zzicVarZzaE);
                            zzgv zzgvVarZza3 = zzgv.zza(zzbhVar);
                            zzicVar = zzlpVarZzn.zzu;
                            zzpp zzppVarZzk3 = zzicVar.zzk();
                            bundle = zzgvVarZza3.zze;
                            zzppVarZzk3.zzK(bundle, zzpgVar2.zzj().zzV(str4));
                            zzicVar.zzk().zzI(zzgvVarZza3, zzicVar.zzc().zzd(str4));
                            bundle.putLong("_c", 1L);
                            zzicVar.zzaW().zzj().zza("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            str = zzbhVar.zzc;
                            bundle.putString("_o", str);
                            if (zzicVar.zzk().zzad(zzicVarZzaE.zzK(), zzhVarZzu.zzay())) {
                                zzicVar.zzk().zzO(bundle, "_dbg", 1L);
                                zzicVar.zzk().zzO(bundle, "_r", 1L);
                            }
                            zzaw zzawVarZzj3 = zzpgVar2.zzj();
                            str2 = zzbhVar.zza;
                            zzbdVarZzf = zzawVarZzj3.zzf(str4, str2);
                            if (zzbdVarZzf == null) {
                                zzpgVar4 = zzpgVar3;
                                obj = null;
                                z3 = true;
                                zzhzVar = zzhzVarZzi;
                                str3 = str;
                                bundle2 = bundle;
                                zzbdVarZza = new zzbd(str4, str2, 0L, 0L, 0L, zzbhVar.zzd, 0L, null, null, null, null);
                                j6 = 0;
                            } else {
                                zzpgVar4 = zzpgVar3;
                                zzhzVar = zzhzVarZzi;
                                bundle2 = bundle;
                                str3 = str;
                                obj = null;
                                z3 = true;
                                long j12 = zzbdVarZzf.zzf;
                                zzbdVarZza = zzbdVarZzf.zza(zzbhVar.zzd);
                                j6 = j12;
                            }
                            zzbd zzbdVar3 = zzbdVarZza;
                            zzpgVar2.zzj().zzh(zzbdVar3);
                            zzpg zzpgVar8 = zzpgVar4;
                            boolean z11 = z3;
                            com.google.android.gms.internal.measurement.zzhz zzhzVar4 = zzhzVar;
                            zzbc zzbcVar3 = new zzbc(zzlpVarZzn.zzu, str3, str4, str2, zzbhVar.zzd, 0L, j6, bundle2);
                            zzhrVarZzp = com.google.android.gms.internal.measurement.zzhs.zzp();
                            zzhrVarZzp.zzo(zzbcVar3.zzd);
                            zzhrVarZzp.zzl(zzbcVar3.zzb);
                            zzhrVarZzp.zzq(zzbcVar3.zzf);
                            zzbfVar = zzbcVar3.zzg;
                            zzbeVar = new zzbe(zzbfVar);
                            while (zzbeVar.hasNext()) {
                                String next3 = zzbeVar.next();
                                zzhvVarZzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzhvVarZzn.zzb(next3);
                                objZza = zzbfVar.zza(next3);
                                if (objZza != null) {
                                    zzpgVar2.zzp().zzd(zzhvVarZzn, objZza);
                                    zzhrVarZzp.zzg(zzhvVarZzn);
                                }
                            }
                            zzicVarZzaE.zzg(zzhrVarZzp);
                            com.google.android.gms.internal.measurement.zzie zzieVarZza3 = com.google.android.gms.internal.measurement.zzig.zza();
                            com.google.android.gms.internal.measurement.zzht zzhtVarZza3 = com.google.android.gms.internal.measurement.zzhu.zza();
                            zzhtVarZza3.zzb(zzbdVar3.zzc);
                            zzhtVarZza3.zza(str2);
                            zzieVarZza3.zza(zzhtVarZza3);
                            zzicVarZzaE.zzap(zzieVarZza3);
                            zzicVarZzaE.zzaf(zzpgVar2.zzm().zzb(zzhVarZzu.zzc(), Collections.EMPTY_LIST, zzicVarZzaE.zzk(), Long.valueOf(zzhrVarZzp.zzn()), Long.valueOf(zzhrVarZzp.zzn()), false));
                            if (zzhrVarZzp.zzm()) {
                                zzicVarZzaE.zzv(zzhrVarZzp.zzn());
                                zzicVarZzaE.zzx(zzhrVarZzp.zzn());
                            }
                            jZzp = zzhVarZzu.zzp();
                            if (jZzp != 0) {
                                zzicVarZzaE.zzA(jZzp);
                            }
                            jZzn = zzhVarZzu.zzn();
                            if (jZzn != 0) {
                                zzicVarZzaE.zzy(jZzn);
                            } else if (jZzp != 0) {
                                zzicVarZzaE.zzy(jZzp);
                            }
                            strZzh = zzhVarZzu.zzh();
                            zzair.zza();
                            if (zzicVar.zzc().zzp(str4, zzfy.zzaM) && strZzh != null) {
                                zzicVarZzaE.zzau(strZzh);
                            }
                            zzhVarZzu.zzL();
                            zzicVarZzaE.zzZ((int) zzhVarZzu.zzG());
                            zzicVar.zzc().zzi();
                            zzicVarZzaE.zzO(161000L);
                            zzicVarZzaE.zzs(zzicVar.zzba().currentTimeMillis());
                            zzicVarZzaE.zzae(z11);
                            zzpgVar8.zzS(zzicVarZzaE.zzK(), zzicVarZzaE);
                            zzhzVar4.zze(zzicVarZzaE);
                            zzhVarZzu.zzo(zzicVarZzaE.zzu());
                            zzhVarZzu.zzq(zzicVarZzaE.zzw());
                            zzpgVar2.zzj().zzv(zzhVarZzu, false, false);
                            zzpgVar2.zzj().zzc();
                            zzpgVar2.zzj().zzd();
                            try {
                                return zzpgVar2.zzp().zzv(((com.google.android.gms.internal.measurement.zzib) zzhzVar4.zzbd()).zzcd());
                            } catch (IOException e11) {
                                zzlpVarZzn.zzu.zzaW().zzb().zzc("Data loss. Failed to bundle and serialize. appId", zzgu.zzl(str4), e11);
                                return obj;
                            }
                        } catch (SecurityException e12) {
                            zzlpVarZzn.zzu.zzaW().zzj().zzb("app instance id encryption failed", e12.getMessage());
                            bArr = new byte[0];
                            zzpgVar = zzlpVarZzn.zzg;
                        }
                    }
                    zzpgVar.zzj().zzd();
                    return bArr;
                }
                zzlpVarZzn.zzu.zzaW().zzj().zzb("Log and bundle disabled. package_name", str4);
                bArr2 = new byte[0];
            }
            zzpgVar5.zzj().zzd();
            return bArr2;
        } catch (Throwable th) {
            zzlpVarZzn.zzg.zzj().zzd();
            throw th;
        }
    }
}
