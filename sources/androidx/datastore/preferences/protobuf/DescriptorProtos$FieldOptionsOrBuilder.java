package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface DescriptorProtos$FieldOptionsOrBuilder extends GeneratedMessageLite$ExtendableMessageOrBuilder<C1138s0, C1111j0> {
    EnumC1115k0 getCtype();

    boolean getDebugRedact();

    boolean getDeprecated();

    C1121m0 getEditionDefaults(int index);

    int getEditionDefaultsCount();

    List<C1121m0> getEditionDefaultsList();

    C1127o0 getFeatureSupport();

    C1083c0 getFeatures();

    EnumC1130p0 getJstype();

    boolean getLazy();

    boolean getPacked();

    EnumC1133q0 getRetention();

    EnumC1135r0 getTargets(int index);

    int getTargetsCount();

    List<EnumC1135r0> getTargetsList();

    X0 getUninterpretedOption(int index);

    int getUninterpretedOptionCount();

    List<X0> getUninterpretedOptionList();

    boolean getUnverifiedLazy();

    boolean getWeak();

    boolean hasCtype();

    boolean hasDebugRedact();

    boolean hasDeprecated();

    boolean hasFeatureSupport();

    boolean hasFeatures();

    boolean hasJstype();

    boolean hasLazy();

    boolean hasPacked();

    boolean hasRetention();

    boolean hasUnverifiedLazy();

    boolean hasWeak();
}
