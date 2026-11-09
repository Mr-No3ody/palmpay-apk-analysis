package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends AbstractC1139s1 implements DescriptorProtos$ServiceOptionsOrBuilder {
    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
    public final boolean getDeprecated() {
        return ((P0) this.f16750b).getDeprecated();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
    public final C1083c0 getFeatures() {
        return ((P0) this.f16750b).getFeatures();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
    public final X0 getUninterpretedOption(int i7) {
        return ((P0) this.f16750b).getUninterpretedOption(i7);
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
    public final int getUninterpretedOptionCount() {
        return ((P0) this.f16750b).getUninterpretedOptionCount();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
    public final List getUninterpretedOptionList() {
        return Collections.unmodifiableList(((P0) this.f16750b).getUninterpretedOptionList());
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
    public final boolean hasDeprecated() {
        return ((P0) this.f16750b).hasDeprecated();
    }

    @Override // androidx.datastore.preferences.protobuf.DescriptorProtos$ServiceOptionsOrBuilder
    public final boolean hasFeatures() {
        return ((P0) this.f16750b).hasFeatures();
    }
}
