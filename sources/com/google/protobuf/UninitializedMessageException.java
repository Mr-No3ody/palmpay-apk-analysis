package com.google.protobuf;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class UninitializedMessageException extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public UninitializedMessageException(final MessageLite message) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    private static String buildDescription(final List<String> missingFields) {
        StringBuilder sb2 = new StringBuilder("Message missing required fields: ");
        boolean z3 = true;
        for (String str : missingFields) {
            if (z3) {
                z3 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public InvalidProtocolBufferException asInvalidProtocolBufferException() {
        return new InvalidProtocolBufferException(getMessage());
    }

    public List<String> getMissingFields() {
        return Collections.unmodifiableList(this.missingFields);
    }

    public UninitializedMessageException(final List<String> missingFields) {
        super(buildDescription(missingFields));
        this.missingFields = missingFields;
    }
}
