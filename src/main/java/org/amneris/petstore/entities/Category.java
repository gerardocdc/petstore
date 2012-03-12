package org.amneris.petstore.entities;

import java.util.Date;

import org.apache.tapestry5.beaneditor.NonVisual;
import org.hibernate.validator.NotNull;
import org.tynamo.descriptor.annotation.PropertyDescriptor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="CATEGORIES",uniqueConstraints = @UniqueConstraint(columnNames={"name"}))
public class Category
{
	@Id
	@NonVisual
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PropertyDescriptor(index = 0)
	private Long id_category;

	@Column(unique=false,nullable=false)
	@NotNull(message = "name can't be null")
	private String name;
	private String description;
	private String link_rewrite;
	private String meta_title;
	private String meta_keywords;
	private String meta_description;
	private boolean active;
	private Date date_add;
	private Date date_update;

	
	public Long getId_category() {
		return id_category;
	}

	public void setId_category(Long id_category) {
		this.id_category = id_category;
	}

	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getLink_rewrite() {
		return link_rewrite;
	}

	public void setLink_rewrite(String link_rewrite) {
		this.link_rewrite = link_rewrite;
	}

	public String getMeta_title() {
		return meta_title;
	}

	public void setMeta_title(String meta_title) {
		this.meta_title = meta_title;
	}

	public String getMeta_keywords() {
		return meta_keywords;
	}

	public void setMeta_keywords(String meta_keywords) {
		this.meta_keywords = meta_keywords;
	}

	public String getMeta_description() {
		return meta_description;
	}

	public void setMeta_description(String meta_description) {
		this.meta_description = meta_description;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Date getDate_add() {
		return date_add;
	}

	public void setDate_add(Date date_add) {
		this.date_add = date_add;
	}

	public Date getDate_update() {
		return date_update;
	}

	public void setDate_update(Date date_update) {
		this.date_update = date_update;
	}


	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Category that = (Category) o;

		return getId_category() != null ? getId_category().equals(that.getId_category()) : that.getId_category() == null;
	}

	public int hashCode()
	{
		return (getId_category() != null ? getId_category().hashCode() : 0);
	}

	public String toString()
	{
		return getName();
	}
}
