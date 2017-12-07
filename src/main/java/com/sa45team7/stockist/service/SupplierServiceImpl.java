package com.sa45team7.stockist.service;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.sa45team7.stockist.model.Supplier;
import com.sa45team7.stockist.repository.SupplierRepository;

@Service
public class SupplierServiceImpl implements SupplierService {
	
	@Resource
	private SupplierRepository supplierRepository;

	@Override
	@Transactional
	public ArrayList<Supplier> findAllSuppliers() {
		ArrayList<Supplier>supplierlist = (ArrayList<Supplier>) supplierRepository.findAll();
		return supplierlist;
	}

	@Override
	@Transactional
	public Supplier findSupplier(Integer supplierId) {
		return supplierRepository.findOne(supplierId);
	}
	
	@Override
	@Transactional
	public Supplier updateSupplier(Supplier supplier) {
		return supplierRepository.saveAndFlush(supplier);
	}

	@Override
	@Transactional
	public Supplier findSupplierByName(String supplierName) {
		return supplierRepository.findSupplierByName(supplierName);
	}

	@Override
	@Transactional
	public Supplier findSupplierByContactName(String contactName) {
		return supplierRepository.findSupplierByContactName(contactName);
	}

	@Override
	@Transactional
	public Supplier findSupplierByPhoneNumber(String phoneNumber) {
		return supplierRepository.findSupplierByPhoneNumber(phoneNumber);
	}

	@Override
	@Transactional
	public Supplier findSupplierByEmail(String email) {
		return supplierRepository.findSupplierByEmail(email);
	}

	@Override
	@Transactional
	public Supplier findSupplierByWebSite(String website) {
		return supplierRepository.findSupplierByWebsite(website);
	}

	@Override
	@Transactional
	public Supplier createSupplier(Supplier supplier) {
		return supplierRepository.saveAndFlush(supplier);
	}
}