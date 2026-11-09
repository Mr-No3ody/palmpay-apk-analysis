package com.google.firebase.messaging;

import N8.q0;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.alibaba.android.arouter.utils.Consts;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
final class TopicOperation {
    private static final String OLD_TOPIC_PREFIX = "/topics/";

    @VisibleForTesting
    static final String OPERATION_PAIR_DIVIDER = "!";
    private static final String TOPIC_NAME_PATTERN = "[a-zA-Z0-9-_.~%]{1,900}";
    private static final Pattern TOPIC_NAME_REGEXP = Pattern.compile(TOPIC_NAME_PATTERN);
    private final String operation;
    private final String serializedString;
    private final String topic;

    private TopicOperation(String str, String str2) {
        this.topic = normalizeTopicOrThrow(str2, str);
        this.operation = str;
        this.serializedString = q0.y(str, OPERATION_PAIR_DIVIDER, str2);
    }

    @Nullable
    public static TopicOperation from(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split(OPERATION_PAIR_DIVIDER, -1);
        if (strArrSplit.length != 2) {
            return null;
        }
        return new TopicOperation(strArrSplit[0], strArrSplit[1]);
    }

    @NonNull
    private static String normalizeTopicOrThrow(String str, String str2) {
        if (str != null && str.startsWith(OLD_TOPIC_PREFIX)) {
            StringBuilder sb2 = new StringBuilder("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in ");
            sb2.append(str2);
            sb2.append(Consts.DOT);
            str = str.substring(8);
        }
        if (str == null || !TOPIC_NAME_REGEXP.matcher(str).matches()) {
            throw new IllegalArgumentException(q0.k("Invalid topic name: ", str, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        return str;
    }

    public static TopicOperation subscribe(@NonNull String str) {
        return new TopicOperation("S", str);
    }

    public static TopicOperation unsubscribe(@NonNull String str) {
        return new TopicOperation("U", str);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof TopicOperation)) {
            return false;
        }
        TopicOperation topicOperation = (TopicOperation) obj;
        return this.topic.equals(topicOperation.topic) && this.operation.equals(topicOperation.operation);
    }

    public String getOperation() {
        return this.operation;
    }

    public String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return Objects.hashCode(this.operation, this.topic);
    }

    public String serialize() {
        return this.serializedString;
    }
}
