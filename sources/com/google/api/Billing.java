package com.google.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Billing extends GeneratedMessageLite<Billing, Builder> implements BillingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    private static final Billing DEFAULT_INSTANCE;
    private static volatile Parser<Billing> PARSER;
    private Internal.ProtobufList<BillingDestination> consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.google.api.Billing$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class BillingDestination extends GeneratedMessageLite<BillingDestination, Builder> implements BillingDestinationOrBuilder {
        private static final BillingDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile Parser<BillingDestination> PARSER;
        private String monitoredResource_ = "";
        private Internal.ProtobufList<String> metrics_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<BillingDestination, Builder> implements BillingDestinationOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllMetrics(Iterable<String> iterable) {
                copyOnWrite();
                ((BillingDestination) this.instance).addAllMetrics(iterable);
                return this;
            }

            public Builder addMetrics(String str) {
                copyOnWrite();
                ((BillingDestination) this.instance).addMetrics(str);
                return this;
            }

            public Builder addMetricsBytes(ByteString byteString) {
                copyOnWrite();
                ((BillingDestination) this.instance).addMetricsBytes(byteString);
                return this;
            }

            public Builder clearMetrics() {
                copyOnWrite();
                ((BillingDestination) this.instance).clearMetrics();
                return this;
            }

            public Builder clearMonitoredResource() {
                copyOnWrite();
                ((BillingDestination) this.instance).clearMonitoredResource();
                return this;
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public String getMetrics(int i7) {
                return ((BillingDestination) this.instance).getMetrics(i7);
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public ByteString getMetricsBytes(int i7) {
                return ((BillingDestination) this.instance).getMetricsBytes(i7);
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public int getMetricsCount() {
                return ((BillingDestination) this.instance).getMetricsCount();
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public List<String> getMetricsList() {
                return Collections.unmodifiableList(((BillingDestination) this.instance).getMetricsList());
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public String getMonitoredResource() {
                return ((BillingDestination) this.instance).getMonitoredResource();
            }

            @Override // com.google.api.Billing.BillingDestinationOrBuilder
            public ByteString getMonitoredResourceBytes() {
                return ((BillingDestination) this.instance).getMonitoredResourceBytes();
            }

            public Builder setMetrics(int i7, String str) {
                copyOnWrite();
                ((BillingDestination) this.instance).setMetrics(i7, str);
                return this;
            }

            public Builder setMonitoredResource(String str) {
                copyOnWrite();
                ((BillingDestination) this.instance).setMonitoredResource(str);
                return this;
            }

            public Builder setMonitoredResourceBytes(ByteString byteString) {
                copyOnWrite();
                ((BillingDestination) this.instance).setMonitoredResourceBytes(byteString);
                return this;
            }

            private Builder() {
                super(BillingDestination.DEFAULT_INSTANCE);
            }
        }

        static {
            BillingDestination billingDestination = new BillingDestination();
            DEFAULT_INSTANCE = billingDestination;
            GeneratedMessageLite.registerDefaultInstance(BillingDestination.class, billingDestination);
        }

        private BillingDestination() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMetrics(Iterable<String> iterable) {
            ensureMetricsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.metrics_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetrics(String str) {
            str.getClass();
            ensureMetricsIsMutable();
            this.metrics_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetricsBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureMetricsIsMutable();
            this.metrics_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetrics() {
            this.metrics_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonitoredResource() {
            this.monitoredResource_ = getDefaultInstance().getMonitoredResource();
        }

        private void ensureMetricsIsMutable() {
            Internal.ProtobufList<String> protobufList = this.metrics_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.metrics_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static BillingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BillingDestination parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BillingDestination> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetrics(int i7, String str) {
            str.getClass();
            ensureMetricsIsMutable();
            this.metrics_.set(i7, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonitoredResource(String str) {
            str.getClass();
            this.monitoredResource_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonitoredResourceBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.monitoredResource_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new BillingDestination();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BillingDestination> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (BillingDestination.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public String getMetrics(int i7) {
            return this.metrics_.get(i7);
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public ByteString getMetricsBytes(int i7) {
            return ByteString.copyFromUtf8(this.metrics_.get(i7));
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public int getMetricsCount() {
            return this.metrics_.size();
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public List<String> getMetricsList() {
            return this.metrics_;
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        @Override // com.google.api.Billing.BillingDestinationOrBuilder
        public ByteString getMonitoredResourceBytes() {
            return ByteString.copyFromUtf8(this.monitoredResource_);
        }

        public static Builder newBuilder(BillingDestination billingDestination) {
            return DEFAULT_INSTANCE.createBuilder(billingDestination);
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BillingDestination parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BillingDestination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BillingDestination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BillingDestination parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BillingDestination parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BillingDestination parseFrom(InputStream inputStream) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BillingDestination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BillingDestination parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BillingDestination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BillingDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface BillingDestinationOrBuilder extends MessageLiteOrBuilder {
        String getMetrics(int i7);

        ByteString getMetricsBytes(int i7);

        int getMetricsCount();

        List<String> getMetricsList();

        String getMonitoredResource();

        ByteString getMonitoredResourceBytes();
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Billing, Builder> implements BillingOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder addAllConsumerDestinations(Iterable<? extends BillingDestination> iterable) {
            copyOnWrite();
            ((Billing) this.instance).addAllConsumerDestinations(iterable);
            return this;
        }

        public Builder addConsumerDestinations(BillingDestination billingDestination) {
            copyOnWrite();
            ((Billing) this.instance).addConsumerDestinations(billingDestination);
            return this;
        }

        public Builder clearConsumerDestinations() {
            copyOnWrite();
            ((Billing) this.instance).clearConsumerDestinations();
            return this;
        }

        @Override // com.google.api.BillingOrBuilder
        public BillingDestination getConsumerDestinations(int i7) {
            return ((Billing) this.instance).getConsumerDestinations(i7);
        }

        @Override // com.google.api.BillingOrBuilder
        public int getConsumerDestinationsCount() {
            return ((Billing) this.instance).getConsumerDestinationsCount();
        }

        @Override // com.google.api.BillingOrBuilder
        public List<BillingDestination> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((Billing) this.instance).getConsumerDestinationsList());
        }

        public Builder removeConsumerDestinations(int i7) {
            copyOnWrite();
            ((Billing) this.instance).removeConsumerDestinations(i7);
            return this;
        }

        public Builder setConsumerDestinations(int i7, BillingDestination billingDestination) {
            copyOnWrite();
            ((Billing) this.instance).setConsumerDestinations(i7, billingDestination);
            return this;
        }

        private Builder() {
            super(Billing.DEFAULT_INSTANCE);
        }

        public Builder addConsumerDestinations(int i7, BillingDestination billingDestination) {
            copyOnWrite();
            ((Billing) this.instance).addConsumerDestinations(i7, billingDestination);
            return this;
        }

        public Builder setConsumerDestinations(int i7, BillingDestination.Builder builder) {
            copyOnWrite();
            ((Billing) this.instance).setConsumerDestinations(i7, builder.build());
            return this;
        }

        public Builder addConsumerDestinations(BillingDestination.Builder builder) {
            copyOnWrite();
            ((Billing) this.instance).addConsumerDestinations(builder.build());
            return this;
        }

        public Builder addConsumerDestinations(int i7, BillingDestination.Builder builder) {
            copyOnWrite();
            ((Billing) this.instance).addConsumerDestinations(i7, builder.build());
            return this;
        }
    }

    static {
        Billing billing = new Billing();
        DEFAULT_INSTANCE = billing;
        GeneratedMessageLite.registerDefaultInstance(Billing.class, billing);
    }

    private Billing() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends BillingDestination> iterable) {
        ensureConsumerDestinationsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.consumerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(BillingDestination billingDestination) {
        billingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(billingDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsumerDestinations() {
        this.consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        Internal.ProtobufList<BillingDestination> protobufList = this.consumerDestinations_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Billing getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Billing parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Billing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Billing parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Billing> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConsumerDestinations(int i7) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumerDestinations(int i7, BillingDestination billingDestination) {
        billingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i7, billingDestination);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Billing();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"consumerDestinations_", BillingDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Billing> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Billing.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.api.BillingOrBuilder
    public BillingDestination getConsumerDestinations(int i7) {
        return this.consumerDestinations_.get(i7);
    }

    @Override // com.google.api.BillingOrBuilder
    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    @Override // com.google.api.BillingOrBuilder
    public List<BillingDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public BillingDestinationOrBuilder getConsumerDestinationsOrBuilder(int i7) {
        return this.consumerDestinations_.get(i7);
    }

    public List<? extends BillingDestinationOrBuilder> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public static Builder newBuilder(Billing billing) {
        return DEFAULT_INSTANCE.createBuilder(billing);
    }

    public static Billing parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Billing) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Billing parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Billing parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(int i7, BillingDestination billingDestination) {
        billingDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i7, billingDestination);
    }

    public static Billing parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Billing parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Billing parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Billing parseFrom(InputStream inputStream) throws IOException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Billing parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Billing parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Billing parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Billing) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
