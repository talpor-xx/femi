package com.femi.femi_poc.model.json;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Date;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "Id", "Expose",
      "MaximumServices", "Name4", "QualificationDate2", "SumServicesUsage",
      "ListOfFemiAgreementLineItemAsset" })
public class FemiAgreementEntitlement implements Serializable
{

   @com.fasterxml.jackson.annotation.JsonProperty("Id")
   private String id;
   @com.fasterxml.jackson.annotation.JsonProperty("Expose")
   private String expose;
   @com.fasterxml.jackson.annotation.JsonProperty("MaximumServices")
   private String maximumServices;
   @com.fasterxml.jackson.annotation.JsonProperty("Name4")
   private String name4;
   @com.fasterxml.jackson.annotation.JsonProperty("QualificationDate2")
   private Date qualificationDate2;
   @com.fasterxml.jackson.annotation.JsonProperty("SumServicesUsage")
   private String sumServicesUsage;
   @com.fasterxml.jackson.annotation.JsonProperty("ListOfFemiAgreementLineItemAsset")
   private ListOfFemiAgreementLineItemAsset listOfFemiAgreementLineItemAsset;

   private final static long serialVersionUID = 7862339401013262127L;

   @JsonProperty("Id")
   public String getId()
   {
      return id;
   }

   @JsonProperty("Id")
   public void setId(String id)
   {
      this.id = id;
   }

   @JsonProperty("Expose")
   public String getExpose()
   {
      return expose;
   }

   @JsonProperty("Expose")
   public void setExpose(String expose)
   {
      this.expose = expose;
   }

   @JsonProperty("MaximumServices")
   public String getMaximumServices()
   {
      return maximumServices;
   }

   @JsonProperty("MaximumServices")
   public void setMaximumServices(String maximumServices)
   {
      this.maximumServices = maximumServices;
   }

   @JsonProperty("Name4")
   public String getName4()
   {
      return name4;
   }

   @JsonProperty("Name4")
   public void setName4(String name4)
   {
      this.name4 = name4;
   }

   @JsonProperty("SumServicesUsage")
   public String getSumServicesUsage()
   {
      return sumServicesUsage;
   }

   @JsonProperty("SumServicesUsage")
   public void setSumServicesUsage(String sumServicesUsage)
   {
      this.sumServicesUsage = sumServicesUsage;
   }

   @JsonProperty("ListOfFemiAgreementLineItemAsset")
   public ListOfFemiAgreementLineItemAsset getListOfFemiAgreementLineItemAsset()
   {
      return listOfFemiAgreementLineItemAsset;
   }

   @JsonProperty("ListOfFemiAgreementLineItemAsset")
   public void setListOfFemiAgreementLineItemAsset(ListOfFemiAgreementLineItemAsset listOfFemiAgreementLineItemAsset)
   {
      this.listOfFemiAgreementLineItemAsset = listOfFemiAgreementLineItemAsset;
   }

   public java.util.Date getQualificationDate2()
   {
      return this.qualificationDate2;
   }

   public void setQualificationDate2(java.util.Date qualificationDate2)
   {
      this.qualificationDate2 = qualificationDate2;
   }

   public FemiAgreementEntitlement()
   {
   }

   public FemiAgreementEntitlement(
         java.lang.String id,
         java.lang.String expose,
         java.lang.String maximumServices,
         java.lang.String name4,
         java.util.Date qualificationDate2,
         java.lang.String sumServicesUsage,
         com.femi.femi_poc.model.json.ListOfFemiAgreementLineItemAsset listOfFemiAgreementLineItemAsset)
   {
      this.id = id;
      this.expose = expose;
      this.maximumServices = maximumServices;
      this.name4 = name4;
      this.qualificationDate2 = qualificationDate2;
      this.sumServicesUsage = sumServicesUsage;
      this.listOfFemiAgreementLineItemAsset = listOfFemiAgreementLineItemAsset;
   }

}
