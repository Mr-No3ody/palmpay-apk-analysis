package com.google.firebase.remoteconfig.internal;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigContainer {
    static final String ABT_EXPERIMENTS_KEY = "abt_experiments_key";
    static final String CONFIGS_KEY = "configs_key";
    private static final Date DEFAULTS_FETCH_TIME = new Date(0);
    static final String FETCH_TIME_KEY = "fetch_time_key";
    static final String PERSONALIZATION_METADATA_KEY = "personalization_metadata_key";
    static final String ROLLOUT_ID_PREFIX = "rollout";
    public static final String ROLLOUT_METADATA_AFFECTED_KEYS = "affectedParameterKeys";
    public static final String ROLLOUT_METADATA_ID = "rolloutId";
    static final String ROLLOUT_METADATA_KEY = "rollout_metadata_key";
    public static final String ROLLOUT_METADATA_VARIANT_ID = "variantId";
    static final String TEMPLATE_VERSION_NUMBER_KEY = "template_version_number_key";
    private JSONArray abtExperiments;
    private JSONObject configsJson;
    private JSONObject containerJson;
    private Date fetchTime;
    private JSONObject personalizationMetadata;
    private JSONArray rolloutMetadata;
    private long templateVersionNumber;

    public static class Builder {
        private JSONArray builderAbtExperiments;
        private JSONObject builderConfigsJson;
        private Date builderFetchTime;
        private JSONObject builderPersonalizationMetadata;
        private JSONArray builderRolloutMetadata;
        private long builderTemplateVersionNumber;

        public ConfigContainer build() throws JSONException {
            return new ConfigContainer(this.builderConfigsJson, this.builderFetchTime, this.builderAbtExperiments, this.builderPersonalizationMetadata, this.builderTemplateVersionNumber, this.builderRolloutMetadata);
        }

        @CanIgnoreReturnValue
        public Builder replaceConfigsWith(Map<String, String> map) {
            this.builderConfigsJson = new JSONObject(map);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withAbtExperiments(JSONArray jSONArray) {
            try {
                this.builderAbtExperiments = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withFetchTime(Date date) {
            this.builderFetchTime = date;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withPersonalizationMetadata(JSONObject jSONObject) {
            try {
                this.builderPersonalizationMetadata = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withRolloutMetadata(JSONArray jSONArray) {
            try {
                this.builderRolloutMetadata = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder withTemplateVersionNumber(long j6) {
            this.builderTemplateVersionNumber = j6;
            return this;
        }

        private Builder() {
            this.builderConfigsJson = new JSONObject();
            this.builderFetchTime = ConfigContainer.DEFAULTS_FETCH_TIME;
            this.builderAbtExperiments = new JSONArray();
            this.builderPersonalizationMetadata = new JSONObject();
            this.builderTemplateVersionNumber = 0L;
            this.builderRolloutMetadata = new JSONArray();
        }

        @CanIgnoreReturnValue
        public Builder replaceConfigsWith(JSONObject jSONObject) {
            try {
                this.builderConfigsJson = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public Builder(ConfigContainer configContainer) {
            this.builderConfigsJson = configContainer.getConfigs();
            this.builderFetchTime = configContainer.getFetchTime();
            this.builderAbtExperiments = configContainer.getAbtExperiments();
            this.builderPersonalizationMetadata = configContainer.getPersonalizationMetadata();
            this.builderTemplateVersionNumber = configContainer.getTemplateVersionNumber();
            this.builderRolloutMetadata = configContainer.getRolloutMetadata();
        }
    }

    public static ConfigContainer copyOf(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(PERSONALIZATION_METADATA_KEY);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(ROLLOUT_METADATA_KEY);
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new ConfigContainer(jSONObject.getJSONObject(CONFIGS_KEY), new Date(jSONObject.getLong(FETCH_TIME_KEY)), jSONObject.getJSONArray(ABT_EXPERIMENTS_KEY), jSONObject2, jSONObject.optLong(TEMPLATE_VERSION_NUMBER_KEY), jSONArrayOptJSONArray);
    }

    private Map<String, JSONObject> createExperimentsMap() throws JSONException {
        HashMap map = new HashMap();
        JSONArray abtExperiments = getAbtExperiments();
        for (int i7 = 0; i7 < abtExperiments.length(); i7++) {
            JSONObject jSONObject = abtExperiments.getJSONObject(i7);
            if (jSONObject.has("affectedParameterKeys") && !jSONObject.getString(RemoteConfigConstants.ExperimentDescriptionFieldKey.EXPERIMENT_ID).startsWith(ROLLOUT_ID_PREFIX)) {
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    map.put(jSONArray.getString(i10), jSONObject);
                }
            }
        }
        return map;
    }

    private Map<String, Map<String, String>> createRolloutParameterKeyMap() throws JSONException {
        HashMap map = new HashMap();
        for (int i7 = 0; i7 < getRolloutMetadata().length(); i7++) {
            JSONObject jSONObject = getRolloutMetadata().getJSONObject(i7);
            String string = jSONObject.getString(ROLLOUT_METADATA_ID);
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String string3 = jSONArray.getString(i10);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
        }
        return map;
    }

    private static ConfigContainer deepCopyOf(JSONObject jSONObject) throws JSONException {
        return copyOf(new JSONObject(jSONObject.toString()));
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfigContainer) {
            return this.containerJson.toString().equals(((ConfigContainer) obj).toString());
        }
        return false;
    }

    public JSONArray getAbtExperiments() {
        return this.abtExperiments;
    }

    public Set<String> getChangedParams(ConfigContainer configContainer) throws JSONException {
        JSONObject configs = deepCopyOf(configContainer.containerJson).getConfigs();
        Map<String, Map<String, String>> mapCreateRolloutParameterKeyMap = createRolloutParameterKeyMap();
        Map<String, Map<String, String>> mapCreateRolloutParameterKeyMap2 = configContainer.createRolloutParameterKeyMap();
        Map<String, JSONObject> mapCreateExperimentsMap = createExperimentsMap();
        Map<String, JSONObject> mapCreateExperimentsMap2 = configContainer.createExperimentsMap();
        HashSet hashSet = new HashSet();
        Iterator<String> itKeys = getConfigs().keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!configContainer.getConfigs().has(next)) {
                hashSet.add(next);
            } else if (!getConfigs().get(next).equals(configContainer.getConfigs().get(next))) {
                hashSet.add(next);
            } else if ((getPersonalizationMetadata().has(next) && !configContainer.getPersonalizationMetadata().has(next)) || (!getPersonalizationMetadata().has(next) && configContainer.getPersonalizationMetadata().has(next))) {
                hashSet.add(next);
            } else if (getPersonalizationMetadata().has(next) && configContainer.getPersonalizationMetadata().has(next) && !getPersonalizationMetadata().getJSONObject(next).toString().equals(configContainer.getPersonalizationMetadata().getJSONObject(next).toString())) {
                hashSet.add(next);
            } else if (mapCreateRolloutParameterKeyMap.containsKey(next) != mapCreateRolloutParameterKeyMap2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapCreateRolloutParameterKeyMap.containsKey(next) && mapCreateRolloutParameterKeyMap2.containsKey(next) && !mapCreateRolloutParameterKeyMap.get(next).equals(mapCreateRolloutParameterKeyMap2.get(next))) {
                hashSet.add(next);
            } else if (mapCreateExperimentsMap.containsKey(next) != mapCreateExperimentsMap2.containsKey(next)) {
                hashSet.add(next);
            } else if (mapCreateExperimentsMap2.containsKey(next) && mapCreateExperimentsMap.containsKey(next) && !mapCreateExperimentsMap2.get(next).toString().equals(mapCreateExperimentsMap.get(next).toString())) {
                hashSet.add(next);
            } else {
                configs.remove(next);
            }
        }
        Iterator<String> itKeys2 = configs.keys();
        while (itKeys2.hasNext()) {
            hashSet.add(itKeys2.next());
        }
        return hashSet;
    }

    public JSONObject getConfigs() {
        return this.configsJson;
    }

    public Date getFetchTime() {
        return this.fetchTime;
    }

    public JSONObject getPersonalizationMetadata() {
        return this.personalizationMetadata;
    }

    public JSONArray getRolloutMetadata() {
        return this.rolloutMetadata;
    }

    public long getTemplateVersionNumber() {
        return this.templateVersionNumber;
    }

    public int hashCode() {
        return this.containerJson.hashCode();
    }

    public String toString() {
        return this.containerJson.toString();
    }

    private ConfigContainer(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j6, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(CONFIGS_KEY, jSONObject);
        jSONObject3.put(FETCH_TIME_KEY, date.getTime());
        jSONObject3.put(ABT_EXPERIMENTS_KEY, jSONArray);
        jSONObject3.put(PERSONALIZATION_METADATA_KEY, jSONObject2);
        jSONObject3.put(TEMPLATE_VERSION_NUMBER_KEY, j6);
        jSONObject3.put(ROLLOUT_METADATA_KEY, jSONArray2);
        this.configsJson = jSONObject;
        this.fetchTime = date;
        this.abtExperiments = jSONArray;
        this.personalizationMetadata = jSONObject2;
        this.templateVersionNumber = j6;
        this.rolloutMetadata = jSONArray2;
        this.containerJson = jSONObject3;
    }

    public static Builder newBuilder(ConfigContainer configContainer) {
        return new Builder(configContainer);
    }
}
