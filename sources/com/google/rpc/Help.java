package com.google.rpc;

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

/* JADX INFO: loaded from: classes3.dex */
public final class Help extends GeneratedMessageLite<Help, Builder> implements HelpOrBuilder {
    private static final Help DEFAULT_INSTANCE;
    public static final int LINKS_FIELD_NUMBER = 1;
    private static volatile Parser<Help> PARSER;
    private Internal.ProtobufList<Link> links_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: renamed from: com.google.rpc.Help$1, reason: invalid class name */
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

    public static final class Builder extends GeneratedMessageLite.Builder<Help, Builder> implements HelpOrBuilder {
        public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
            this();
        }

        public Builder addAllLinks(Iterable<? extends Link> iterable) {
            copyOnWrite();
            ((Help) this.instance).addAllLinks(iterable);
            return this;
        }

        public Builder addLinks(Link link) {
            copyOnWrite();
            ((Help) this.instance).addLinks(link);
            return this;
        }

        public Builder clearLinks() {
            copyOnWrite();
            ((Help) this.instance).clearLinks();
            return this;
        }

        @Override // com.google.rpc.HelpOrBuilder
        public Link getLinks(int i7) {
            return ((Help) this.instance).getLinks(i7);
        }

        @Override // com.google.rpc.HelpOrBuilder
        public int getLinksCount() {
            return ((Help) this.instance).getLinksCount();
        }

        @Override // com.google.rpc.HelpOrBuilder
        public List<Link> getLinksList() {
            return Collections.unmodifiableList(((Help) this.instance).getLinksList());
        }

        public Builder removeLinks(int i7) {
            copyOnWrite();
            ((Help) this.instance).removeLinks(i7);
            return this;
        }

        public Builder setLinks(int i7, Link link) {
            copyOnWrite();
            ((Help) this.instance).setLinks(i7, link);
            return this;
        }

        private Builder() {
            super(Help.DEFAULT_INSTANCE);
        }

        public Builder addLinks(int i7, Link link) {
            copyOnWrite();
            ((Help) this.instance).addLinks(i7, link);
            return this;
        }

        public Builder setLinks(int i7, Link.Builder builder) {
            copyOnWrite();
            ((Help) this.instance).setLinks(i7, builder.build());
            return this;
        }

        public Builder addLinks(Link.Builder builder) {
            copyOnWrite();
            ((Help) this.instance).addLinks(builder.build());
            return this;
        }

        public Builder addLinks(int i7, Link.Builder builder) {
            copyOnWrite();
            ((Help) this.instance).addLinks(i7, builder.build());
            return this;
        }
    }

    public static final class Link extends GeneratedMessageLite<Link, Builder> implements LinkOrBuilder {
        private static final Link DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 1;
        private static volatile Parser<Link> PARSER = null;
        public static final int URL_FIELD_NUMBER = 2;
        private String description_ = "";
        private String url_ = "";

        public static final class Builder extends GeneratedMessageLite.Builder<Link, Builder> implements LinkOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDescription() {
                copyOnWrite();
                ((Link) this.instance).clearDescription();
                return this;
            }

            public Builder clearUrl() {
                copyOnWrite();
                ((Link) this.instance).clearUrl();
                return this;
            }

            @Override // com.google.rpc.Help.LinkOrBuilder
            public String getDescription() {
                return ((Link) this.instance).getDescription();
            }

            @Override // com.google.rpc.Help.LinkOrBuilder
            public ByteString getDescriptionBytes() {
                return ((Link) this.instance).getDescriptionBytes();
            }

            @Override // com.google.rpc.Help.LinkOrBuilder
            public String getUrl() {
                return ((Link) this.instance).getUrl();
            }

            @Override // com.google.rpc.Help.LinkOrBuilder
            public ByteString getUrlBytes() {
                return ((Link) this.instance).getUrlBytes();
            }

            public Builder setDescription(String str) {
                copyOnWrite();
                ((Link) this.instance).setDescription(str);
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                copyOnWrite();
                ((Link) this.instance).setDescriptionBytes(byteString);
                return this;
            }

            public Builder setUrl(String str) {
                copyOnWrite();
                ((Link) this.instance).setUrl(str);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                copyOnWrite();
                ((Link) this.instance).setUrlBytes(byteString);
                return this;
            }

            private Builder() {
                super(Link.DEFAULT_INSTANCE);
            }
        }

        static {
            Link link = new Link();
            DEFAULT_INSTANCE = link;
            GeneratedMessageLite.registerDefaultInstance(Link.class, link);
        }

        private Link() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUrl() {
            this.url_ = getDefaultInstance().getUrl();
        }

        public static Link getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Link parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Link) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Link parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Link> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.description_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrl(String str) {
            str.getClass();
            this.url_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUrlBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.url_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Link();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"description_", "url_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Link> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Link.class) {
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

        @Override // com.google.rpc.Help.LinkOrBuilder
        public String getDescription() {
            return this.description_;
        }

        @Override // com.google.rpc.Help.LinkOrBuilder
        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8(this.description_);
        }

        @Override // com.google.rpc.Help.LinkOrBuilder
        public String getUrl() {
            return this.url_;
        }

        @Override // com.google.rpc.Help.LinkOrBuilder
        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8(this.url_);
        }

        public static Builder newBuilder(Link link) {
            return DEFAULT_INSTANCE.createBuilder(link);
        }

        public static Link parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Link) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Link parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Link parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Link parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Link parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Link parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Link parseFrom(InputStream inputStream) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Link parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Link parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Link parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Link) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface LinkOrBuilder extends MessageLiteOrBuilder {
        String getDescription();

        ByteString getDescriptionBytes();

        String getUrl();

        ByteString getUrlBytes();
    }

    static {
        Help help = new Help();
        DEFAULT_INSTANCE = help;
        GeneratedMessageLite.registerDefaultInstance(Help.class, help);
    }

    private Help() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLinks(Iterable<? extends Link> iterable) {
        ensureLinksIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.links_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLinks(Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.add(link);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinks() {
        this.links_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureLinksIsMutable() {
        Internal.ProtobufList<Link> protobufList = this.links_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.links_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Help getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Help parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Help) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Help parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Help> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLinks(int i7) {
        ensureLinksIsMutable();
        this.links_.remove(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinks(int i7, Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.set(i7, link);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        AnonymousClass1 anonymousClass1 = null;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Help();
            case 2:
                return new Builder(anonymousClass1);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"links_", Link.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Help> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Help.class) {
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

    @Override // com.google.rpc.HelpOrBuilder
    public Link getLinks(int i7) {
        return this.links_.get(i7);
    }

    @Override // com.google.rpc.HelpOrBuilder
    public int getLinksCount() {
        return this.links_.size();
    }

    @Override // com.google.rpc.HelpOrBuilder
    public List<Link> getLinksList() {
        return this.links_;
    }

    public LinkOrBuilder getLinksOrBuilder(int i7) {
        return this.links_.get(i7);
    }

    public List<? extends LinkOrBuilder> getLinksOrBuilderList() {
        return this.links_;
    }

    public static Builder newBuilder(Help help) {
        return DEFAULT_INSTANCE.createBuilder(help);
    }

    public static Help parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Help) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Help parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Help parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLinks(int i7, Link link) {
        link.getClass();
        ensureLinksIsMutable();
        this.links_.add(i7, link);
    }

    public static Help parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Help parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Help parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Help parseFrom(InputStream inputStream) throws IOException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Help parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Help parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Help parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Help) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
