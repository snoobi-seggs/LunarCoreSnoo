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

public final class GetMainMissionCustomValueCsReqOuterClass {
  /**
   * Protobuf type {@code GetMainMissionCustomValueCsReq}
   */
  public static final class GetMainMissionCustomValueCsReq extends ProtoMessage<GetMainMissionCustomValueCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated uint32 main_mission_id_list = 13;</code>
     */
    private final RepeatedInt mainMissionIdList = RepeatedInt.newEmptyInstance();

    private GetMainMissionCustomValueCsReq() {
    }

    /**
     * @return a new empty instance of {@code GetMainMissionCustomValueCsReq}
     */
    public static GetMainMissionCustomValueCsReq newInstance() {
      return new GetMainMissionCustomValueCsReq();
    }

    /**
     * <code>repeated uint32 main_mission_id_list = 13;</code>
     * @return whether the mainMissionIdList field is set
     */
    public boolean hasMainMissionIdList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated uint32 main_mission_id_list = 13;</code>
     * @return this
     */
    public GetMainMissionCustomValueCsReq clearMainMissionIdList() {
      bitField0_ &= ~0x00000001;
      mainMissionIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 main_mission_id_list = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMainMissionIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getMainMissionIdList() {
      return mainMissionIdList;
    }

    /**
     * <code>repeated uint32 main_mission_id_list = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableMainMissionIdList() {
      bitField0_ |= 0x00000001;
      return mainMissionIdList;
    }

    /**
     * <code>repeated uint32 main_mission_id_list = 13;</code>
     * @param value the mainMissionIdList to add
     * @return this
     */
    public GetMainMissionCustomValueCsReq addMainMissionIdList(final int value) {
      bitField0_ |= 0x00000001;
      mainMissionIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 main_mission_id_list = 13;</code>
     * @param values the mainMissionIdList to add
     * @return this
     */
    public GetMainMissionCustomValueCsReq addAllMainMissionIdList(final int... values) {
      bitField0_ |= 0x00000001;
      mainMissionIdList.addAll(values);
      return this;
    }

    @Override
    public GetMainMissionCustomValueCsReq copyFrom(final GetMainMissionCustomValueCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        mainMissionIdList.copyFrom(other.mainMissionIdList);
      }
      return this;
    }

    @Override
    public GetMainMissionCustomValueCsReq mergeFrom(final GetMainMissionCustomValueCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasMainMissionIdList()) {
        getMutableMainMissionIdList().addAll(other.mainMissionIdList);
      }
      return this;
    }

    @Override
    public GetMainMissionCustomValueCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mainMissionIdList.clear();
      return this;
    }

    @Override
    public GetMainMissionCustomValueCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      mainMissionIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetMainMissionCustomValueCsReq)) {
        return false;
      }
      GetMainMissionCustomValueCsReq other = (GetMainMissionCustomValueCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasMainMissionIdList() || mainMissionIdList.equals(other.mainMissionIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < mainMissionIdList.length(); i++) {
          output.writeRawByte((byte) 104);
          output.writeUInt32NoTag(mainMissionIdList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * mainMissionIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(mainMissionIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetMainMissionCustomValueCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 106: {
            // mainMissionIdList [packed=true]
            input.readPackedUInt32(mainMissionIdList, tag);
            bitField0_ |= 0x00000001;
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
          case 104: {
            // mainMissionIdList [packed=false]
            tag = input.readRepeatedUInt32(mainMissionIdList, tag);
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedUInt32(FieldNames.mainMissionIdList, mainMissionIdList);
      }
      output.endObject();
    }

    @Override
    public GetMainMissionCustomValueCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1438400460:
          case -1382679799: {
            if (input.isAtField(FieldNames.mainMissionIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(mainMissionIdList);
                bitField0_ |= 0x00000001;
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
    public GetMainMissionCustomValueCsReq clone() {
      return new GetMainMissionCustomValueCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetMainMissionCustomValueCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetMainMissionCustomValueCsReq(), data).checkInitialized();
    }

    public static GetMainMissionCustomValueCsReq parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetMainMissionCustomValueCsReq(), input).checkInitialized();
    }

    public static GetMainMissionCustomValueCsReq parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new GetMainMissionCustomValueCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetMainMissionCustomValueCsReq messages
     */
    public static MessageFactory<GetMainMissionCustomValueCsReq> getFactory() {
      return GetMainMissionCustomValueCsReqFactory.INSTANCE;
    }

    private enum GetMainMissionCustomValueCsReqFactory implements MessageFactory<GetMainMissionCustomValueCsReq> {
      INSTANCE;

      @Override
      public GetMainMissionCustomValueCsReq create() {
        return GetMainMissionCustomValueCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName mainMissionIdList = FieldName.forField("mainMissionIdList", "main_mission_id_list");
    }
  }
}
