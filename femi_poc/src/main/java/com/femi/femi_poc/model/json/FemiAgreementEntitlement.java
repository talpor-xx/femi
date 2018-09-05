package com.femi.femi_poc.model.json;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Date;

public class FemiAgreementEntitlement implements Serializable
{

   @com.google.gson.annotations.SerializedName("Id")
   @com.google.gson.annotations.Expose
   private String id;
   @com.google.gson.annotations.SerializedName("Expose")
   @com.google.gson.annotations.Expose
   private String expose;
   @com.google.gson.annotations.SerializedName("MaximumServices")
   @com.google.gson.annotations.Expose
   private String maximumServices;
   @com.google.gson.annotations.SerializedName("Name4")
   @com.google.gson.annotations.Expose
   private String name4;
   @com.google.gson.annotations.SerializedName("QualificationDate2")
   @com.google.gson.annotations.Expose
   private Date qualificationDate2;
   @com.google.gson.annotations.SerializedName("SumServicesUsage")
   @com.google.gson.annotations.Expose
   private String sumServicesUsage;
   @com.google.gson.annotations.SerializedName("ListOfFemiAgreementLineItemAsset")
   @com.google.gson.annotations.Expose
   private ListOfFemiAgreementLineItemAsset listOfFemiAgreementLineItemAsset;
   private final static long serialVersionUID = 7862339401013262127L;

   private java.util.Date currentDate;

   public String getId()
   {
      return id;
   }

   public void setId(String id)
   {
      this.id = id;
   }

   public String getExpose()
   {
      return expose;
   }

   public void setExpose(String expose)
   {
      this.expose = expose;
   }

   public String getMaximumServices()
   {
      return maximumServices;
   }

   public void setMaximumServices(String maximumServices)
   {
      this.maximumServices = maximumServices;
   }

   public String getName4()
   {
      return name4;
   }

   public void setName4(String name4)
   {
      this.name4 = name4;
   }

   public Date getQualificationDate2()
   {
      return qualificationDate2;
   }

   public void setQualificationDate2(Date qualificationDate2)
   {
      this.qualificationDate2 = qualificationDate2;
   }

   public String getSumServicesUsage()
   {
      return sumServicesUsage;
   }

   public void setSumServicesUsage(String sumServicesUsage)
   {
      this.sumServicesUsage = sumServicesUsage;
   }

   public ListOfFemiAgreementLineItemAsset getListOfFemiAgreementLineItemAsset()
   {
      return listOfFemiAgreementLineItemAsset;
   }

   public void setListOfFemiAgreementLineItemAsset(
         ListOfFemiAgreementLineItemAsset listOfFemiAgreementLineItemAsset)
   {
      this.listOfFemiAgreementLineItemAsset = listOfFemiAgreementLineItemAsset;
   }

   @Override
   public String toString()
   {
      return "FemiAgreementEntitlement [id=" + id + ", expose=" + expose
            + ", maximumServices=" + maximumServices + ", name4=" + name4
            + ", qualificationDate2=" + qualificationDate2
            + ", sumServicesUsage=" + sumServicesUsage
            + ", listOfFemiAgreementLineItemAsset="
            + listOfFemiAgreementLineItemAsset + "]";
   }

   public FemiAgreementEntitlement()
   {
   }

   public java.util.Date getCurrentDate()
   {
      return this.currentDate;
   }

   public void setCurrentDate(java.util.Date currentDate)
   {
      this.currentDate = currentDate;
   }

   public FemiAgreementEntitlement(
         java.lang.String id,
         java.lang.String expose,
         java.lang.String maximumServices,
         java.lang.String name4,
         java.util.Date qualificationDate2,
         java.lang.String sumServicesUsage,
         com.femi.femi_poc.model.json.ListOfFemiAgreementLineItemAsset listOfFemiAgreementLineItemAsset,
         java.util.Date currentDate)
   {
      this.id = id;
      this.expose = expose;
      this.maximumServices = maximumServices;
      this.name4 = name4;
      this.qualificationDate2 = qualificationDate2;
      this.sumServicesUsage = sumServicesUsage;
      this.listOfFemiAgreementLineItemAsset = listOfFemiAgreementLineItemAsset;
      this.currentDate = currentDate;
   }

}
