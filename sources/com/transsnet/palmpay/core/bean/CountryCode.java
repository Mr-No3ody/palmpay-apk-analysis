package com.transsnet.palmpay.core.bean;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class CountryCode {
    private List<CountriesBean> countries;

    public static class CountriesBean {
        public int code;
        public String currency;
        public String en;
        public String locale;
        public String symbol;
        public String zh;

        public CountriesBean(String en, String zh, String locale, String currency, String symbol, int code) {
            this.en = en;
            this.zh = zh;
            this.locale = locale;
            this.currency = currency;
            this.symbol = symbol;
            this.code = code;
        }
    }

    public List<CountriesBean> getCountries() {
        return this.countries;
    }

    public void setCountries(List<CountriesBean> countries) {
        this.countries = countries;
    }
}
