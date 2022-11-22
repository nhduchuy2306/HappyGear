package com.notimplement.happygear.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Table(name = "tbl_product_description")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProductDescription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id", nullable = false)
	private Integer productId;
	
	@Column(name = "kepcap")
	private String keycap;
	
	@Column(name = "switch")
	private String _switch;
	
	@Column(name = "type_keyboard")
	private String typeKeyboard;
	
	@Column(name = "connect")
	private String connect;
	
	@Column(name = "led")
	private String led;
	
	@Column(name = "freigh")
	private String freigh;
	
	@Column(name = "item_dimension")
	private String itemDimension;
	
	@Column(name = "cpu")
	private String cpu;
	
	@Column(name = "ram")
	private String ram;
	
	@Column(name = "operating_system")
	private String operatingSystem;
	
	@Column(name = "battery")
	private String battery;
	
	@Column(name = "hard_disk")
	private String hardDisk;
	
	@Column(name = "graphic_card")
	private String graphicCard;
	
	@Column(name = "key_board")
	private String keyBoard;
	
	@Column(name = "audio")
	private String audio;
	
	@Column(name = "wifi")
	private String wifi;
	
	@Column(name = "bluetooth")
	private String bluetooth;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "frame_rate")
	private String frameRate;
	
	@Column(name = "screen_size")
	private String screenSize;
	
	@Column(name = "screen_type")
	private String screenType;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	@JsonBackReference
	private Category desCategory;
	
	@OneToOne
	@JoinColumn(name = "product_id")
	@JsonBackReference
	private Product product;
	
	
}