package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface DescriptorProtos$EnumOptionsOrBuilder extends GeneratedMessageLite$ExtendableMessageOrBuilder<K, J> {
    boolean getAllowAlias();

    boolean getDeprecated();

    @Deprecated
    boolean getDeprecatedLegacyJsonFieldConflicts();

    C1083c0 getFeatures();

    X0 getUninterpretedOption(int index);

    int getUninterpretedOptionCount();

    List<X0> getUninterpretedOptionList();

    boolean hasAllowAlias();

    boolean hasDeprecated();

    @Deprecated
    boolean hasDeprecatedLegacyJsonFieldConflicts();

    boolean hasFeatures();
}
