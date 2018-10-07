
package com.femi.femi_poc.model.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"numberOfServicesRemaining",
"listOfFEMIFSAgreementSubItem",
"id",
"searchspec",
"activityCount",
"agreementItemProductId",
"agreementItemProductName",
"currentAvailableStock2",
"deductionMax2",
"deductionMaxPercent",
"maximumQuantity",
"parentAgreementItemId",
"parentAgreementLineItemId",
"periodUOM2",
"productId",
"stockUsage2",
"writeInProduct",
"femiAgreementLineItemAsset1",
"operation"
})
public class ListOfFemiAgreementLineItemAsset {

@JsonProperty("numberOfServicesRemaining")
private String numberOfServicesRemaining;
@JsonProperty("listOfFEMIFSAgreementSubItem")
private List<Object> listOfFEMIFSAgreementSubItem = null;
@JsonProperty("id")
private String id;
@JsonProperty("searchspec")
private Object searchspec;
@JsonProperty("activityCount")
private String activityCount;
@JsonProperty("agreementItemProductId")
private String agreementItemProductId;
@JsonProperty("agreementItemProductName")
private String agreementItemProductName;
@JsonProperty("currentAvailableStock2")
private String currentAvailableStock2;
@JsonProperty("deductionMax2")
private String deductionMax2;
@JsonProperty("deductionMaxPercent")
private String deductionMaxPercent;
@JsonProperty("maximumQuantity")
private String maximumQuantity;
@JsonProperty("parentAgreementItemId")
private Object parentAgreementItemId;
@JsonProperty("parentAgreementLineItemId")
private String parentAgreementLineItemId;
@JsonProperty("periodUOM2")
private String periodUOM2;
@JsonProperty("productId")
private Object productId;
@JsonProperty("stockUsage2")
private Object stockUsage2;
@JsonProperty("writeInProduct")
private String writeInProduct;
@JsonProperty("femiAgreementLineItemAsset1")
private Object femiAgreementLineItemAsset1;
@JsonProperty("operation")
private Object operation;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("numberOfServicesRemaining")
public String getNumberOfServicesRemaining() {
return numberOfServicesRemaining;
}

@JsonProperty("numberOfServicesRemaining")
public void setNumberOfServicesRemaining(String numberOfServicesRemaining) {
this.numberOfServicesRemaining = numberOfServicesRemaining;
}

@JsonProperty("listOfFEMIFSAgreementSubItem")
public List<Object> getListOfFEMIFSAgreementSubItem() {
return listOfFEMIFSAgreementSubItem;
}

@JsonProperty("listOfFEMIFSAgreementSubItem")
public void setListOfFEMIFSAgreementSubItem(List<Object> listOfFEMIFSAgreementSubItem) {
this.listOfFEMIFSAgreementSubItem = listOfFEMIFSAgreementSubItem;
}

@JsonProperty("id")
public String getId() {
return id;
}

@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

@JsonProperty("searchspec")
public Object getSearchspec() {
return searchspec;
}

@JsonProperty("searchspec")
public void setSearchspec(Object searchspec) {
this.searchspec = searchspec;
}

@JsonProperty("activityCount")
public String getActivityCount() {
return activityCount;
}

@JsonProperty("activityCount")
public void setActivityCount(String activityCount) {
this.activityCount = activityCount;
}

@JsonProperty("agreementItemProductId")
public String getAgreementItemProductId() {
return agreementItemProductId;
}

@JsonProperty("agreementItemProductId")
public void setAgreementItemProductId(String agreementItemProductId) {
this.agreementItemProductId = agreementItemProductId;
}

@JsonProperty("agreementItemProductName")
public String getAgreementItemProductName() {
return agreementItemProductName;
}

@JsonProperty("agreementItemProductName")
public void setAgreementItemProductName(String agreementItemProductName) {
this.agreementItemProductName = agreementItemProductName;
}

@JsonProperty("currentAvailableStock2")
public String getCurrentAvailableStock2() {
return currentAvailableStock2;
}

@JsonProperty("currentAvailableStock2")
public void setCurrentAvailableStock2(String currentAvailableStock2) {
this.currentAvailableStock2 = currentAvailableStock2;
}

@JsonProperty("deductionMax2")
public String getDeductionMax2() {
return deductionMax2;
}

@JsonProperty("deductionMax2")
public void setDeductionMax2(String deductionMax2) {
this.deductionMax2 = deductionMax2;
}

@JsonProperty("deductionMaxPercent")
public String getDeductionMaxPercent() {
return deductionMaxPercent;
}

@JsonProperty("deductionMaxPercent")
public void setDeductionMaxPercent(String deductionMaxPercent) {
this.deductionMaxPercent = deductionMaxPercent;
}

@JsonProperty("maximumQuantity")
public String getMaximumQuantity() {
return maximumQuantity;
}

@JsonProperty("maximumQuantity")
public void setMaximumQuantity(String maximumQuantity) {
this.maximumQuantity = maximumQuantity;
}

@JsonProperty("parentAgreementItemId")
public Object getParentAgreementItemId() {
return parentAgreementItemId;
}

@JsonProperty("parentAgreementItemId")
public void setParentAgreementItemId(Object parentAgreementItemId) {
this.parentAgreementItemId = parentAgreementItemId;
}

@JsonProperty("parentAgreementLineItemId")
public String getParentAgreementLineItemId() {
return parentAgreementLineItemId;
}

@JsonProperty("parentAgreementLineItemId")
public void setParentAgreementLineItemId(String parentAgreementLineItemId) {
this.parentAgreementLineItemId = parentAgreementLineItemId;
}

@JsonProperty("periodUOM2")
public String getPeriodUOM2() {
return periodUOM2;
}

@JsonProperty("periodUOM2")
public void setPeriodUOM2(String periodUOM2) {
this.periodUOM2 = periodUOM2;
}

@JsonProperty("productId")
public Object getProductId() {
return productId;
}

@JsonProperty("productId")
public void setProductId(Object productId) {
this.productId = productId;
}

@JsonProperty("stockUsage2")
public Object getStockUsage2() {
return stockUsage2;
}

@JsonProperty("stockUsage2")
public void setStockUsage2(Object stockUsage2) {
this.stockUsage2 = stockUsage2;
}

@JsonProperty("writeInProduct")
public String getWriteInProduct() {
return writeInProduct;
}

@JsonProperty("writeInProduct")
public void setWriteInProduct(String writeInProduct) {
this.writeInProduct = writeInProduct;
}

@JsonProperty("femiAgreementLineItemAsset1")
public Object getFemiAgreementLineItemAsset1() {
return femiAgreementLineItemAsset1;
}

@JsonProperty("femiAgreementLineItemAsset1")
public void setFemiAgreementLineItemAsset1(Object femiAgreementLineItemAsset1) {
this.femiAgreementLineItemAsset1 = femiAgreementLineItemAsset1;
}

@JsonProperty("operation")
public Object getOperation() {
return operation;
}

@JsonProperty("operation")
public void setOperation(Object operation) {
this.operation = operation;
}

@JsonAnyGetter
public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

@JsonAnySetter
public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}
