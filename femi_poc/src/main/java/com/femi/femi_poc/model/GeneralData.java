package com.femi.femi_poc.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class GeneralData implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "current date")
   private java.util.Date currentDate = new java.util.Date();

   public GeneralData()
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

   public GeneralData(java.util.Date currentDate)
   {
      this.currentDate = currentDate;
   }

}