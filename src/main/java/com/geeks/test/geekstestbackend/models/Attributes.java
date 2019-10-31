package com.geeks.test.geekstestbackend.models;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Field;

public class Attributes {


	private ObjectId _id;
	
	private String code;
	
	@Field("hiherarchy_code")
	private String hiherarchyCode;
	
	private List<String> roles;
	
	private Boolean required;
	
	private Boolean variant;
	
	@Field("description_translations")
	private List<String> descriptionTranslations;
	
	private String label;
	
	@Field("label_translations")
	private List<Translation> labelTranslations;
	
	private List<String> values;
	
	@Field("requirement_level")
	private String requiremenLevel;
	
	@Field("values_list")
	private String valuesList;
	
	private String type;
	
	private String example;
	
	@Field("type_parameter")
	private String typeParameter;
	
	private String description;
	
	private List<String> synonymes;

	public ObjectId get_Id() {
		return _id;
	}
	
	public String getCode() {
		return code;
	}

	public String getHiherarchyCode() {
		return hiherarchyCode;
	}

	public List<String> getRoles() {
		return roles;
	}

	public Boolean getRequired() {
		return required;
	}

	public Boolean getVariant() {
		return variant;
	}

	public List<String> getDescriptionTranslations() {
		return descriptionTranslations;
	}

	public String getLabel() {
		return label;
	}

	public List<Translation> getLabelTranslations() {
		return labelTranslations;
	}

	public List<String> getValues() {
		return values;
	}

	public String getRequiremenLevel() {
		return requiremenLevel;
	}

	public String getValuesList() {
		return valuesList;
	}

	public String getType() {
		return type;
	}

	public String getExample() {
		return example;
	}

	public String getTypeParameter() {
		return typeParameter;
	}

	public String getDescription() {
		return description;
	}
	
	public List<String> getSynonymes() {
		return synonymes;
	}

	public void set_Id(ObjectId _id) {
		this._id = _id;
	}
	
	public void setCode(String code) {
		this.code = code;
	}

	public void setHiherarchyCode(String hiherarchyCode) {
		this.hiherarchyCode = hiherarchyCode;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	public void setVariant(Boolean variant) {
		this.variant = variant;
	}

	public void setDescriptionTranslations(List<String> descriptionTranslations) {
		this.descriptionTranslations = descriptionTranslations;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setLabelTranslations(List<Translation> labelTranslations) {
		this.labelTranslations = labelTranslations;
	}

	public void setValues(List<String> values) {
		this.values = values;
	}

	public void setRequiremenLevel(String requiremenLevel) {
		this.requiremenLevel = requiremenLevel;
	}

	public void setValuesList(String valuesList) {
		this.valuesList = valuesList;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setExample(String example) {
		this.example = example;
	}

	public void setTypeParameter(String typeParameter) {
		this.typeParameter = typeParameter;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public List<String> setSynonymes(List<String> synonymes) {
		return this.synonymes = synonymes;
	}
	
	
	
	
}
