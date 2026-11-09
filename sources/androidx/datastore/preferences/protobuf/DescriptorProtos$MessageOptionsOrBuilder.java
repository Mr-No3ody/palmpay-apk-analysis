package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface DescriptorProtos$MessageOptionsOrBuilder extends GeneratedMessageLite$ExtendableMessageOrBuilder<C0, B0> {
    boolean getDeprecated();

    @Deprecated
    boolean getDeprecatedLegacyJsonFieldConflicts();

    C1083c0 getFeatures();

    boolean getMapEntry();

    boolean getMessageSetWireFormat();

    boolean getNoStandardDescriptorAccessor();

    X0 getUninterpretedOption(int index);

    int getUninterpretedOptionCount();

    List<X0> getUninterpretedOptionList();

    boolean hasDeprecated();

    @Deprecated
    boolean hasDeprecatedLegacyJsonFieldConflicts();

    boolean hasFeatures();

    boolean hasMapEntry();

    boolean hasMessageSetWireFormat();

    boolean hasNoStandardDescriptorAccessor();
}
