/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.whizpath.kafka.generated;
@org.apache.avro.specific.AvroGenerated
public enum OrderStatus implements org.apache.avro.generic.GenericEnumSymbol<OrderStatus> {
  PENDING, UNSHIPPED, PARTIALLY_SHIPPED, SHIPPED, CANCELLED, PENDING_AVAILABILITY  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"OrderStatus\",\"namespace\":\"com.whizpath.kafka.generated\",\"symbols\":[\"PENDING\",\"UNSHIPPED\",\"PARTIALLY_SHIPPED\",\"SHIPPED\",\"CANCELLED\",\"PENDING_AVAILABILITY\"],\"default\":\"PENDING\"}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
