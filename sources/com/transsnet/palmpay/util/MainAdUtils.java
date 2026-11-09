package com.transsnet.palmpay.util;

import Ac.h;

/* JADX INFO: loaded from: classes4.dex */
public class MainAdUtils {
    public static String getAdSlotId(int i7) {
        if (i7 == h.main_ad_home_banner_slot_id) {
            return "E1F2570CEEFD47C1A3B8ACDC0DDB9C79";
        }
        if (i7 == h.main_ad_home_pop_slot_id) {
            return "EF9A4CD810554CF7AC23DF9F2B9CB25C";
        }
        if (i7 == h.main_ad_home_pop_high_priority_slot_id) {
            return "E0FECDB0D325457EA22BA8C8DE462CA6";
        }
        if (i7 == h.main_ad_splash_slot_id) {
            return "56392A3BDA5F4DB0863D9534F71A477A";
        }
        return i7 == h.main_home_top_text_slot_id ? "2C32B855A8AD4E17B32E693381377651" : "";
    }
}
