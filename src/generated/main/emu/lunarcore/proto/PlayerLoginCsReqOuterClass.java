// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.Utf8String;

public final class PlayerLoginCsReqOuterClass {
  /**
   * Protobuf type {@code PlayerLoginCsReq}
   */
  public static final class PlayerLoginCsReq extends ProtoMessage<PlayerLoginCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint64 login_random = 8;</code>
     */
    private long loginRandom;

    /**
     * <code>optional string signature = 5;</code>
     */
    private final Utf8String signature = Utf8String.newEmptyInstance();

    private PlayerLoginCsReq() {
    }

    /**
     * @return a new empty instance of {@code PlayerLoginCsReq}
     */
    public static PlayerLoginCsReq newInstance() {
      return new PlayerLoginCsReq();
    }

    /**
     * <code>optional uint64 login_random = 8;</code>
     * @return whether the loginRandom field is set
     */
    public boolean hasLoginRandom() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint64 login_random = 8;</code>
     * @return this
     */
    public PlayerLoginCsReq clearLoginRandom() {
      bitField0_ &= ~0x00000001;
      loginRandom = 0L;
      return this;
    }

    /**
     * <code>optional uint64 login_random = 8;</code>
     * @return the loginRandom
     */
    public long getLoginRandom() {
      return loginRandom;
    }

    /**
     * <code>optional uint64 login_random = 8;</code>
     * @param value the loginRandom to set
     * @return this
     */
    public PlayerLoginCsReq setLoginRandom(final long value) {
      bitField0_ |= 0x00000001;
      loginRandom = value;
      return this;
    }

    /**
     * <code>optional string signature = 5;</code>
     * @return whether the signature field is set
     */
    public boolean hasSignature() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional string signature = 5;</code>
     * @return this
     */
    public PlayerLoginCsReq clearSignature() {
      bitField0_ &= ~0x00000002;
      signature.clear();
      return this;
    }

    /**
     * <code>optional string signature = 5;</code>
     * @return the signature
     */
    public String getSignature() {
      return signature.getString();
    }

    /**
     * <code>optional string signature = 5;</code>
     * @return internal {@code Utf8String} representation of signature for reading
     */
    public Utf8String getSignatureBytes() {
      return this.signature;
    }

    /**
     * <code>optional string signature = 5;</code>
     * @return internal {@code Utf8String} representation of signature for modifications
     */
    public Utf8String getMutableSignatureBytes() {
      bitField0_ |= 0x00000002;
      return this.signature;
    }

    /**
     * <code>optional string signature = 5;</code>
     * @param value the signature to set
     * @return this
     */
    public PlayerLoginCsReq setSignature(final CharSequence value) {
      bitField0_ |= 0x00000002;
      signature.copyFrom(value);
      return this;
    }

    /**
     * <code>optional string signature = 5;</code>
     * @param value the signature to set
     * @return this
     */
    public PlayerLoginCsReq setSignature(final Utf8String value) {
      bitField0_ |= 0x00000002;
      signature.copyFrom(value);
      return this;
    }

    @Override
    public PlayerLoginCsReq copyFrom(final PlayerLoginCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        loginRandom = other.loginRandom;
        signature.copyFrom(other.signature);
      }
      return this;
    }

    @Override
    public PlayerLoginCsReq mergeFrom(final PlayerLoginCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasLoginRandom()) {
        setLoginRandom(other.loginRandom);
      }
      if (other.hasSignature()) {
        getMutableSignatureBytes().copyFrom(other.signature);
      }
      return this;
    }

    @Override
    public PlayerLoginCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      loginRandom = 0L;
      signature.clear();
      return this;
    }

    @Override
    public PlayerLoginCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      signature.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof PlayerLoginCsReq)) {
        return false;
      }
      PlayerLoginCsReq other = (PlayerLoginCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasLoginRandom() || loginRandom == other.loginRandom)
        && (!hasSignature() || signature.equals(other.signature));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt64NoTag(loginRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 42);
        output.writeStringNoTag(signature);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(loginRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeStringSizeNoTag(signature);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public PlayerLoginCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // loginRandom
            loginRandom = input.readUInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 42) {
              break;
            }
          }
          case 42: {
            // signature
            input.readString(signature);
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt64(FieldNames.loginRandom, loginRandom);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeString(FieldNames.signature, signature);
      }
      output.endObject();
    }

    @Override
    public PlayerLoginCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1268567436:
          case -201491879: {
            if (input.isAtField(FieldNames.loginRandom)) {
              if (!input.trySkipNullValue()) {
                loginRandom = input.readUInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1073584312: {
            if (input.isAtField(FieldNames.signature)) {
              if (!input.trySkipNullValue()) {
                input.readString(signature);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public PlayerLoginCsReq clone() {
      return new PlayerLoginCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static PlayerLoginCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new PlayerLoginCsReq(), data).checkInitialized();
    }

    public static PlayerLoginCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerLoginCsReq(), input).checkInitialized();
    }

    public static PlayerLoginCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new PlayerLoginCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating PlayerLoginCsReq messages
     */
    public static MessageFactory<PlayerLoginCsReq> getFactory() {
      return PlayerLoginCsReqFactory.INSTANCE;
    }

    private enum PlayerLoginCsReqFactory implements MessageFactory<PlayerLoginCsReq> {
      INSTANCE;

      @Override
      public PlayerLoginCsReq create() {
        return PlayerLoginCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName loginRandom = FieldName.forField("loginRandom", "login_random");

      static final FieldName signature = FieldName.forField("signature");
    }
  }
}
