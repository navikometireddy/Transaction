package com.example.input.processor;

import com.example.exceptions.ExtensionDoesNotExist;
import com.example.exceptions.FileNotAllowedException;

import java.util.List;

public interface FileProcessor {
    List<String>  process(String fileName) throws ExtensionDoesNotExist, FileNotAllowedException;
}
