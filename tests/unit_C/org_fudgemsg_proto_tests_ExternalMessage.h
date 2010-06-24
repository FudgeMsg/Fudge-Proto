#ifndef __INC_ORG_FUDGEMSG_PROTO_TESTS_EXTERNALMESSAGE_H
#define __INC_ORG_FUDGEMSG_PROTO_TESTS_EXTERNALMESSAGE_H

struct _org_fudgemsg_proto_tests_ExternalMessage {
  int fudgeStructSize;
};

FudgeStatus org_fudgemsg_proto_tests_ExternalMessage_fromFudgeMsg (FudgeMsg msg, struct _org_fudgemsg_proto_tests_ExternalMessage **ptr);
FudgeStatus org_fudgemsg_proto_tests_ExternalMessage_toFudgeMsg (struct _org_fudgemsg_proto_tests_ExternalMessage *ptr, FudgeMsg *msg);

#endif /* ifndef INC_ORG_FUDGEMSG_PROTO_TESTS_EXTERNALMESSAGE_H */