package com.palmpay.lib.webview.offline.info;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.palmpay.lib.webview.offline.utils.OfflineConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class OfflineRuleConfig {
    private List<RulesInfo> rules = new ArrayList();

    @Keep
    public static class RulesInfo {

        @SerializedName("fragmentprefix")
        private List<String> fragmentPrefix;
        private List<String> host;

        @SerializedName(OfflineConstant.OFF_WEB)
        private String offWeb;
        private List<String> path;

        public RulesInfo(String str, List<String> list, List<String> list2, List<String> list3) {
            this.offWeb = str;
            this.host = list;
            this.path = list2;
            this.fragmentPrefix = list3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Objects.equals(this.offWeb, ((RulesInfo) obj).offWeb);
        }

        public List<String> getFragmentPrefix() {
            return this.fragmentPrefix;
        }

        public List<String> getHost() {
            return this.host;
        }

        public String getOffWeb() {
            return this.offWeb;
        }

        public List<String> getPath() {
            return this.path;
        }

        public int hashCode() {
            return Objects.hash(this.offWeb);
        }
    }

    public void addRule(RulesInfo rulesInfo) {
        if (this.rules.contains(rulesInfo)) {
            return;
        }
        this.rules.add(rulesInfo);
    }

    public void addRules(List<RulesInfo> list) {
        Iterator<RulesInfo> it = list.iterator();
        while (it.hasNext()) {
            addRule(it.next());
        }
    }

    public List<RulesInfo> getRules() {
        return this.rules;
    }
}
