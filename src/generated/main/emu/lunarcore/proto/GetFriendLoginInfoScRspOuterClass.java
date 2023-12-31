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
import us.hebi.quickbuf.RepeatedInt;

public final class GetFriendLoginInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetFriendLoginInfoScRsp}
   */
  public static final class GetFriendLoginInfoScRsp extends ProtoMessage<GetFriendLoginInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 5;</code>
     */
    private int retcode;

    /**
     * <code>optional bool show_red_dot_flag = 1;</code>
     */
    private boolean showRedDotFlag;

    /**
     * <code>optional bool is_allow_other_apply = 10;</code>
     */
    private boolean isAllowOtherApply;

    /**
     * <code>repeated uint32 black_uid_list = 4;</code>
     */
    private final RepeatedInt blackUidList = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated uint32 friend_uid_list = 14;</code>
     */
    private final RepeatedInt friendUidList = RepeatedInt.newEmptyInstance();

    private GetFriendLoginInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetFriendLoginInfoScRsp}
     */
    public static GetFriendLoginInfoScRsp newInstance() {
      return new GetFriendLoginInfoScRsp();
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return this
     */
    public GetFriendLoginInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 5;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetFriendLoginInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional bool show_red_dot_flag = 1;</code>
     * @return whether the showRedDotFlag field is set
     */
    public boolean hasShowRedDotFlag() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional bool show_red_dot_flag = 1;</code>
     * @return this
     */
    public GetFriendLoginInfoScRsp clearShowRedDotFlag() {
      bitField0_ &= ~0x00000002;
      showRedDotFlag = false;
      return this;
    }

    /**
     * <code>optional bool show_red_dot_flag = 1;</code>
     * @return the showRedDotFlag
     */
    public boolean getShowRedDotFlag() {
      return showRedDotFlag;
    }

    /**
     * <code>optional bool show_red_dot_flag = 1;</code>
     * @param value the showRedDotFlag to set
     * @return this
     */
    public GetFriendLoginInfoScRsp setShowRedDotFlag(final boolean value) {
      bitField0_ |= 0x00000002;
      showRedDotFlag = value;
      return this;
    }

    /**
     * <code>optional bool is_allow_other_apply = 10;</code>
     * @return whether the isAllowOtherApply field is set
     */
    public boolean hasIsAllowOtherApply() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional bool is_allow_other_apply = 10;</code>
     * @return this
     */
    public GetFriendLoginInfoScRsp clearIsAllowOtherApply() {
      bitField0_ &= ~0x00000004;
      isAllowOtherApply = false;
      return this;
    }

    /**
     * <code>optional bool is_allow_other_apply = 10;</code>
     * @return the isAllowOtherApply
     */
    public boolean getIsAllowOtherApply() {
      return isAllowOtherApply;
    }

    /**
     * <code>optional bool is_allow_other_apply = 10;</code>
     * @param value the isAllowOtherApply to set
     * @return this
     */
    public GetFriendLoginInfoScRsp setIsAllowOtherApply(final boolean value) {
      bitField0_ |= 0x00000004;
      isAllowOtherApply = value;
      return this;
    }

    /**
     * <code>repeated uint32 black_uid_list = 4;</code>
     * @return whether the blackUidList field is set
     */
    public boolean hasBlackUidList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated uint32 black_uid_list = 4;</code>
     * @return this
     */
    public GetFriendLoginInfoScRsp clearBlackUidList() {
      bitField0_ &= ~0x00000008;
      blackUidList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 black_uid_list = 4;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableBlackUidList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getBlackUidList() {
      return blackUidList;
    }

    /**
     * <code>repeated uint32 black_uid_list = 4;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableBlackUidList() {
      bitField0_ |= 0x00000008;
      return blackUidList;
    }

    /**
     * <code>repeated uint32 black_uid_list = 4;</code>
     * @param value the blackUidList to add
     * @return this
     */
    public GetFriendLoginInfoScRsp addBlackUidList(final int value) {
      bitField0_ |= 0x00000008;
      blackUidList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 black_uid_list = 4;</code>
     * @param values the blackUidList to add
     * @return this
     */
    public GetFriendLoginInfoScRsp addAllBlackUidList(final int... values) {
      bitField0_ |= 0x00000008;
      blackUidList.addAll(values);
      return this;
    }

    /**
     * <code>repeated uint32 friend_uid_list = 14;</code>
     * @return whether the friendUidList field is set
     */
    public boolean hasFriendUidList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>repeated uint32 friend_uid_list = 14;</code>
     * @return this
     */
    public GetFriendLoginInfoScRsp clearFriendUidList() {
      bitField0_ &= ~0x00000010;
      friendUidList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 friend_uid_list = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableFriendUidList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getFriendUidList() {
      return friendUidList;
    }

    /**
     * <code>repeated uint32 friend_uid_list = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableFriendUidList() {
      bitField0_ |= 0x00000010;
      return friendUidList;
    }

    /**
     * <code>repeated uint32 friend_uid_list = 14;</code>
     * @param value the friendUidList to add
     * @return this
     */
    public GetFriendLoginInfoScRsp addFriendUidList(final int value) {
      bitField0_ |= 0x00000010;
      friendUidList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 friend_uid_list = 14;</code>
     * @param values the friendUidList to add
     * @return this
     */
    public GetFriendLoginInfoScRsp addAllFriendUidList(final int... values) {
      bitField0_ |= 0x00000010;
      friendUidList.addAll(values);
      return this;
    }

    @Override
    public GetFriendLoginInfoScRsp copyFrom(final GetFriendLoginInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        showRedDotFlag = other.showRedDotFlag;
        isAllowOtherApply = other.isAllowOtherApply;
        blackUidList.copyFrom(other.blackUidList);
        friendUidList.copyFrom(other.friendUidList);
      }
      return this;
    }

    @Override
    public GetFriendLoginInfoScRsp mergeFrom(final GetFriendLoginInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasShowRedDotFlag()) {
        setShowRedDotFlag(other.showRedDotFlag);
      }
      if (other.hasIsAllowOtherApply()) {
        setIsAllowOtherApply(other.isAllowOtherApply);
      }
      if (other.hasBlackUidList()) {
        getMutableBlackUidList().addAll(other.blackUidList);
      }
      if (other.hasFriendUidList()) {
        getMutableFriendUidList().addAll(other.friendUidList);
      }
      return this;
    }

    @Override
    public GetFriendLoginInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      showRedDotFlag = false;
      isAllowOtherApply = false;
      blackUidList.clear();
      friendUidList.clear();
      return this;
    }

    @Override
    public GetFriendLoginInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      blackUidList.clear();
      friendUidList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetFriendLoginInfoScRsp)) {
        return false;
      }
      GetFriendLoginInfoScRsp other = (GetFriendLoginInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasShowRedDotFlag() || showRedDotFlag == other.showRedDotFlag)
        && (!hasIsAllowOtherApply() || isAllowOtherApply == other.isAllowOtherApply)
        && (!hasBlackUidList() || blackUidList.equals(other.blackUidList))
        && (!hasFriendUidList() || friendUidList.equals(other.friendUidList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 40);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 8);
        output.writeBoolNoTag(showRedDotFlag);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeBoolNoTag(isAllowOtherApply);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < blackUidList.length(); i++) {
          output.writeRawByte((byte) 32);
          output.writeUInt32NoTag(blackUidList.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000010) != 0) {
        for (int i = 0; i < friendUidList.length(); i++) {
          output.writeRawByte((byte) 112);
          output.writeUInt32NoTag(friendUidList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 2;
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * blackUidList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(blackUidList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += (1 * friendUidList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(friendUidList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetFriendLoginInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 40: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 8) {
              break;
            }
          }
          case 8: {
            // showRedDotFlag
            showRedDotFlag = input.readBool();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // isAllowOtherApply
            isAllowOtherApply = input.readBool();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 34) {
              break;
            }
          }
          case 34: {
            // blackUidList [packed=true]
            input.readPackedUInt32(blackUidList, tag);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // friendUidList [packed=true]
            input.readPackedUInt32(friendUidList, tag);
            bitField0_ |= 0x00000010;
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
          case 32: {
            // blackUidList [packed=false]
            tag = input.readRepeatedUInt32(blackUidList, tag);
            bitField0_ |= 0x00000008;
            break;
          }
          case 112: {
            // friendUidList [packed=false]
            tag = input.readRepeatedUInt32(friendUidList, tag);
            bitField0_ |= 0x00000010;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeBool(FieldNames.showRedDotFlag, showRedDotFlag);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeBool(FieldNames.isAllowOtherApply, isAllowOtherApply);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedUInt32(FieldNames.blackUidList, blackUidList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRepeatedUInt32(FieldNames.friendUidList, friendUidList);
      }
      output.endObject();
    }

    @Override
    public GetFriendLoginInfoScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 197350753:
          case 1123923602: {
            if (input.isAtField(FieldNames.showRedDotFlag)) {
              if (!input.trySkipNullValue()) {
                showRedDotFlag = input.readBool();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 442705885:
          case 1355216308: {
            if (input.isAtField(FieldNames.isAllowOtherApply)) {
              if (!input.trySkipNullValue()) {
                isAllowOtherApply = input.readBool();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1562975247:
          case -1854929043: {
            if (input.isAtField(FieldNames.blackUidList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(blackUidList);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 2058895504:
          case -2016931922: {
            if (input.isAtField(FieldNames.friendUidList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(friendUidList);
                bitField0_ |= 0x00000010;
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
    public GetFriendLoginInfoScRsp clone() {
      return new GetFriendLoginInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetFriendLoginInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetFriendLoginInfoScRsp(), data).checkInitialized();
    }

    public static GetFriendLoginInfoScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetFriendLoginInfoScRsp(), input).checkInitialized();
    }

    public static GetFriendLoginInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetFriendLoginInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetFriendLoginInfoScRsp messages
     */
    public static MessageFactory<GetFriendLoginInfoScRsp> getFactory() {
      return GetFriendLoginInfoScRspFactory.INSTANCE;
    }

    private enum GetFriendLoginInfoScRspFactory implements MessageFactory<GetFriendLoginInfoScRsp> {
      INSTANCE;

      @Override
      public GetFriendLoginInfoScRsp create() {
        return GetFriendLoginInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName showRedDotFlag = FieldName.forField("showRedDotFlag", "show_red_dot_flag");

      static final FieldName isAllowOtherApply = FieldName.forField("isAllowOtherApply", "is_allow_other_apply");

      static final FieldName blackUidList = FieldName.forField("blackUidList", "black_uid_list");

      static final FieldName friendUidList = FieldName.forField("friendUidList", "friend_uid_list");
    }
  }
}
