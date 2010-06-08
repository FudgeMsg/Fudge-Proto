#ifndef __INC_ORG_FUDGEMSG_PROTO_TESTS_EXTERNALENUM_H
#define __INC_ORG_FUDGEMSG_PROTO_TESTS_EXTERNALENUM_H

enum _org_fudgemsg_proto_tests_ExternalEnum {
  FOO,
  BAR
};

const char *org_fudgemsg_proto_tests_ExternalEnum_toFudgeEncoding (enum _org_fudgemsg_proto_tests_ExternalEnum value);
enum _org_fudgemsg_proto_tests_ExternalEnum org_fudgemsg_proto_tests_ExternalEnum_fromFudgeEncoding (const char *encodedValue);

#endif /* ifndef INC_ORG_FUDGEMSG_PROTO_TESTS_EXTERNALENUM_H */