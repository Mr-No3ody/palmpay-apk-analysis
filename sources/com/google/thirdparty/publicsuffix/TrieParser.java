package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Queues;
import java.util.Deque;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
final class TrieParser {
    private static final Joiner PREFIX_JOINER = Joiner.on("");

    private static int doParseTrieToBuilder(Deque<CharSequence> deque, CharSequence charSequence, int i7, ImmutableMap.Builder<String, PublicSuffixType> builder) {
        int length = charSequence.length();
        char cCharAt = 0;
        int i10 = i7;
        while (i10 < length && (cCharAt = charSequence.charAt(i10)) != '&' && cCharAt != '?' && cCharAt != '!' && cCharAt != ':' && cCharAt != ',') {
            i10++;
        }
        deque.push(reverse(charSequence.subSequence(i7, i10)));
        if (cCharAt == '!' || cCharAt == '?' || cCharAt == ':' || cCharAt == ',') {
            String strJoin = PREFIX_JOINER.join(deque);
            if (strJoin.length() > 0) {
                builder.put(strJoin, PublicSuffixType.fromCode(cCharAt));
            }
        }
        int iDoParseTrieToBuilder = i10 + 1;
        if (cCharAt != '?' && cCharAt != ',') {
            while (iDoParseTrieToBuilder < length) {
                iDoParseTrieToBuilder += doParseTrieToBuilder(deque, charSequence, iDoParseTrieToBuilder, builder);
                if (charSequence.charAt(iDoParseTrieToBuilder) == '?' || charSequence.charAt(iDoParseTrieToBuilder) == ',') {
                    iDoParseTrieToBuilder++;
                    break;
                }
            }
        }
        deque.pop();
        return iDoParseTrieToBuilder - i7;
    }

    public static ImmutableMap<String, PublicSuffixType> parseTrie(CharSequence charSequence) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int length = charSequence.length();
        int iDoParseTrieToBuilder = 0;
        while (iDoParseTrieToBuilder < length) {
            iDoParseTrieToBuilder += doParseTrieToBuilder(Queues.newArrayDeque(), charSequence, iDoParseTrieToBuilder, builder);
        }
        return builder.buildOrThrow();
    }

    private static CharSequence reverse(CharSequence charSequence) {
        return new StringBuilder(charSequence).reverse();
    }
}
