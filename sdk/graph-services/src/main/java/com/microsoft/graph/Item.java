/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.graph;

/**
 * The type Item.
*/
public class Item extends ODataBaseEntity {

    public Item(){
        setODataType("#Microsoft.Graph.Item");
    }
            
    private IdentitySet createdBy;
     
    /**
    * Gets the created By.
    *
    * @return the IdentitySet
    */
    public IdentitySet getcreatedBy() {
        return this.createdBy; 
    }

    /**
    * Sets the created By.
    *
    * @param value the IdentitySet
    */
    public void setcreatedBy(IdentitySet value) { 
        this.createdBy = value; 
    }
            
    private String eTag;
     
    /**
    * Gets the e Tag.
    *
    * @return the String
    */
    public String geteTag() {
        return this.eTag; 
    }

    /**
    * Sets the e Tag.
    *
    * @param value the String
    */
    public void seteTag(String value) { 
        this.eTag = value; 
    }
            
    private String id;
     
    /**
    * Gets the id.
    *
    * @return the String
    */
    public String getid() {
        return this.id; 
    }

    /**
    * Sets the id.
    *
    * @param value the String
    */
    public void setid(String value) { 
        this.id = value; 
    }
            
    private IdentitySet lastModifiedBy;
     
    /**
    * Gets the last Modified By.
    *
    * @return the IdentitySet
    */
    public IdentitySet getlastModifiedBy() {
        return this.lastModifiedBy; 
    }

    /**
    * Sets the last Modified By.
    *
    * @param value the IdentitySet
    */
    public void setlastModifiedBy(IdentitySet value) { 
        this.lastModifiedBy = value; 
    }
            
    private String name;
     
    /**
    * Gets the name.
    *
    * @return the String
    */
    public String getname() {
        return this.name; 
    }

    /**
    * Sets the name.
    *
    * @param value the String
    */
    public void setname(String value) { 
        this.name = value; 
    }
            
    private ItemReference parentReference;
     
    /**
    * Gets the parent Reference.
    *
    * @return the ItemReference
    */
    public ItemReference getparentReference() {
        return this.parentReference; 
    }

    /**
    * Sets the parent Reference.
    *
    * @param value the ItemReference
    */
    public void setparentReference(ItemReference value) { 
        this.parentReference = value; 
    }
            
    private Long size;
     
    /**
    * Gets the size.
    *
    * @return the Long
    */
    public Long getsize() {
        return this.size; 
    }

    /**
    * Sets the size.
    *
    * @param value the Long
    */
    public void setsize(Long value) { 
        this.size = value; 
    }
            
    private java.util.Calendar dateTimeCreated;
     
    /**
    * Gets the date Time Created.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getdateTimeCreated() {
        return this.dateTimeCreated; 
    }

    /**
    * Sets the date Time Created.
    *
    * @param value the java.util.Calendar
    */
    public void setdateTimeCreated(java.util.Calendar value) { 
        this.dateTimeCreated = value; 
    }
            
    private java.util.Calendar dateTimeLastModified;
     
    /**
    * Gets the date Time Last Modified.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getdateTimeLastModified() {
        return this.dateTimeLastModified; 
    }

    /**
    * Sets the date Time Last Modified.
    *
    * @param value the java.util.Calendar
    */
    public void setdateTimeLastModified(java.util.Calendar value) { 
        this.dateTimeLastModified = value; 
    }
            
    private String type;
     
    /**
    * Gets the type.
    *
    * @return the String
    */
    public String gettype() {
        return this.type; 
    }

    /**
    * Sets the type.
    *
    * @param value the String
    */
    public void settype(String value) { 
        this.type = value; 
    }
            
    private String webUrl;
     
    /**
    * Gets the web Url.
    *
    * @return the String
    */
    public String getwebUrl() {
        return this.webUrl; 
    }

    /**
    * Sets the web Url.
    *
    * @param value the String
    */
    public void setwebUrl(String value) { 
        this.webUrl = value; 
    }
            
    private User createdByUser;
     
    /**
    * Gets the created By User.
    *
    * @return the User
    */
    public User getcreatedByUser() {
        return this.createdByUser; 
    }

    /**
    * Sets the created By User.
    *
    * @param value the User
    */
    public void setcreatedByUser(User value) { 
        this.createdByUser = value; 
    }
            
    private User lastModifiedByUser;
     
    /**
    * Gets the last Modified By User.
    *
    * @return the User
    */
    public User getlastModifiedByUser() {
        return this.lastModifiedByUser; 
    }

    /**
    * Sets the last Modified By User.
    *
    * @param value the User
    */
    public void setlastModifiedByUser(User value) { 
        this.lastModifiedByUser = value; 
    }
    
    
    private java.util.List<Item> children = new java.util.ArrayList<Item>();
    
    
     
    /**
    * Gets the children.
    *
    * @return the java.util.List<Item>
    */
    public java.util.List<Item> getchildren() {
        return this.children; 
    }

    /**
    * Sets the children.
    *
    * @param value the java.util.List<Item>
    */
    public void setchildren(java.util.List<Item> value) { 
        this.children = value; 
    }
}

