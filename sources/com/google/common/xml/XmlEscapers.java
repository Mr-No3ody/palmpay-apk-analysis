package com.google.common.xml;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;

/* JADX INFO: loaded from: classes2.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public class XmlEscapers {
    private static final char MAX_ASCII_CONTROL_CHAR = 31;
    private static final char MIN_ASCII_CONTROL_CHAR = 0;
    private static final Escaper XML_ATTRIBUTE_ESCAPER;
    private static final Escaper XML_CONTENT_ESCAPER;
    private static final Escaper XML_ESCAPER;

    static {
        Escapers.Builder builder = Escapers.builder();
        builder.setSafeRange((char) 0, (char) 65533);
        builder.setUnsafeReplacement("�");
        for (char c6 = 0; c6 <= 31; c6 = (char) (c6 + 1)) {
            if (c6 != '\t' && c6 != '\n' && c6 != '\r') {
                builder.addEscape(c6, "�");
            }
        }
        builder.addEscape('&', "&amp;");
        builder.addEscape('<', "&lt;");
        builder.addEscape('>', "&gt;");
        XML_CONTENT_ESCAPER = builder.build();
        builder.addEscape('\'', "&apos;");
        builder.addEscape('\"', "&quot;");
        XML_ESCAPER = builder.build();
        builder.addEscape('\t', "&#x9;");
        builder.addEscape('\n', "&#xA;");
        builder.addEscape('\r', "&#xD;");
        XML_ATTRIBUTE_ESCAPER = builder.build();
    }

    private XmlEscapers() {
    }

    public static Escaper xmlAttributeEscaper() {
        return XML_ATTRIBUTE_ESCAPER;
    }

    public static Escaper xmlContentEscaper() {
        return XML_CONTENT_ESCAPER;
    }
}
