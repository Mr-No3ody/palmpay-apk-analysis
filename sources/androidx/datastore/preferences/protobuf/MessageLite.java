package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
@CheckReturnValue
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        MessageLite build();

        MessageLite buildPartial();

        @CanIgnoreReturnValue
        Builder clear();

        Builder clone();

        boolean mergeDelimitedFrom(InputStream input) throws IOException;

        boolean mergeDelimitedFrom(InputStream input, C1092e1 extensionRegistry) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(MessageLite other);

        @CanIgnoreReturnValue
        Builder mergeFrom(AbstractC1123n data) throws C1160z1;

        @CanIgnoreReturnValue
        Builder mergeFrom(AbstractC1123n data, C1092e1 extensionRegistry) throws C1160z1;

        @CanIgnoreReturnValue
        Builder mergeFrom(r input) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(r input, C1092e1 extensionRegistry) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(InputStream input) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(InputStream input, C1092e1 extensionRegistry) throws IOException;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] data) throws C1160z1;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] data, int off, int len) throws C1160z1;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] data, int off, int len, C1092e1 extensionRegistry) throws C1160z1;

        @CanIgnoreReturnValue
        Builder mergeFrom(byte[] data, C1092e1 extensionRegistry) throws C1160z1;
    }

    Parser<? extends MessageLite> getParserForType();

    int getSerializedSize();

    Builder newBuilderForType();

    Builder toBuilder();

    byte[] toByteArray();

    AbstractC1123n toByteString();

    void writeDelimitedTo(OutputStream output) throws IOException;

    void writeTo(AbstractC1146v output) throws IOException;

    void writeTo(OutputStream output) throws IOException;
}
