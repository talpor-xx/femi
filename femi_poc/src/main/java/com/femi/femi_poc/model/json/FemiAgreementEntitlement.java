package com.femi.femi_poc.model.json;

import java.io.Serializable;
import java.util.Date;

public class FemiAgreementEntitlement implements Serializable
{

   private String id;
   private String expose;
   private String maximumServices;
   private String name4;
   private String sumServicesUsage;
   private ListOfFemiAgreementLineItemAsset listOfFemiAgreementLineItemAsset;
   private final static long serialVersionUID = 7862339401013262127L;

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
            + ", sumServicesUsage=" + sumServicesUsage
            + ", listOfFemiAgreementLineItemAsset="
            + listOfFemiAgreementLineItemAsset + "]";
   }

   public FemiAgreementEntitlement()
   {
   }

   public FemiAgreementEntitlement(
         java.lang.String id,
         java.lang.String expose,
         java.lang.String maximumServices,
         java.lang.String name4,
         java.lang.String sumServicesUsage,
         com.femi.femi_poc.model.json.ListOfFemiAgreementLineItemAsset listOfFemiAgreementLineItemAsset)
   {
      this.id = id;
      this.expose = expose;
      this.maximumServices = maximumServices;
      this.name4 = name4;
      this.sumServicesUsage = sumServicesUsage;
      this.listOfFemiAgreementLineItemAsset = listOfFemiAgreementLineItemAsset;
   }

}
