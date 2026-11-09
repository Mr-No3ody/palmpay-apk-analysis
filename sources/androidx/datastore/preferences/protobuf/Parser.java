package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface Parser<MessageType> {
    MessageType parseDelimitedFrom(InputStream input) throws C1160z1;

    MessageType parseDelimitedFrom(InputStream input, C1092e1 extensionRegistry) throws C1160z1;

    MessageType parseFrom(AbstractC1123n data) throws C1160z1;

    MessageType parseFrom(AbstractC1123n data, C1092e1 extensionRegistry) throws C1160z1;

    MessageType parseFrom(r input) throws C1160z1;

    MessageType parseFrom(r input, C1092e1 extensionRegistry) throws C1160z1;

    MessageType parseFrom(InputStream input) throws C1160z1;

    MessageType parseFrom(InputStream input, C1092e1 extensionRegistry) throws C1160z1;

    MessageType parseFrom(ByteBuffer data) throws C1160z1;

    MessageType parseFrom(ByteBuffer data, C1092e1 extensionRegistry) throws C1160z1;

    MessageType parseFrom(byte[] data) throws C1160z1;

    MessageType parseFrom(byte[] data, int off, int len) throws C1160z1;

    MessageType parseFrom(byte[] data, int off, int len, C1092e1 extensionRegistry) throws C1160z1;

    MessageType parseFrom(byte[] data, C1092e1 extensionRegistry) throws C1160z1;

    MessageType parsePartialDelimitedFrom(InputStream input) throws C1160z1;

    MessageType parsePartialDelimitedFrom(InputStream input, C1092e1 extensionRegistry) throws C1160z1;

    MessageType parsePartialFrom(AbstractC1123n data) throws C1160z1;

    MessageType parsePartialFrom(AbstractC1123n data, C1092e1 extensionRegistry) throws C1160z1;

    MessageType parsePartialFrom(r input) throws C1160z1;

    MessageType parsePartialFrom(r input, C1092e1 extensionRegistry) throws C1160z1;

    MessageType parsePartialFrom(InputStream input) throws C1160z1;

    MessageType parsePartialFrom(InputStream input, C1092e1 extensionRegistry) throws C1160z1;

    MessageType parsePartialFrom(byte[] data) throws C1160z1;

    MessageType parsePartialFrom(byte[] data, int off, int len) throws C1160z1;

    MessageType parsePartialFrom(byte[] data, int off, int len, C1092e1 extensionRegistry) throws C1160z1;

    MessageType parsePartialFrom(byte[] data, C1092e1 extensionRegistry) throws C1160z1;
}
