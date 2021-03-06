package com.icetea.mailer.api.dto;

import java.util.LinkedList;
import java.util.List;

import com.google.common.collect.Lists;

public class FileResponseDto extends BasicOutputDto {

	private static final long serialVersionUID = 1L;

	private LinkedList<FileMeta> files = Lists.newLinkedList();

	public FileResponseDto() {
		super();
	}

	public FileResponseDto(Integer status, String message, List<String> causes) {
		super(status, message, causes);
	}

	public FileResponseDto(Integer status) {
		super(status);
	}
	
	public FileResponseDto(LinkedList<FileMeta> files) {
		super();
		this.files = files;
	}

	public LinkedList<FileMeta> getFiles() {
		return files;
	}

	public void setFiles(LinkedList<FileMeta> files) {
		this.files = files;
	}
	
}
