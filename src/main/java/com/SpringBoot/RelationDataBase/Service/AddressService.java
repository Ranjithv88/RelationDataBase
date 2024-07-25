package com.SpringBoot.RelationDataBase.Service;

import com.SpringBoot.RelationDataBase.Model.Address;
import com.SpringBoot.RelationDataBase.Model.AddressType;
import com.SpringBoot.RelationDataBase.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public List<Address> AddressGetApi() {
        return addressRepository.findAll();
    }

    public String AddressPostApi(Address address) {
        address.setAddresstype(AddressType.WORK);
        addressRepository.save(address);
        return " Address Record Saved ! ";
    }

    public String AddressPutApi(Address address) {
        address.setAddresstype(AddressType.WORK);
        addressRepository.save(address);
        return " Address Record Update ! ";
    }

    public String AddressDeleteApi(long addressId) {
        addressRepository.deleteById(addressId);
        return " Delete Record Successfully !";
    }

    public String AddressDeleteListApi(List<Long> addressId) {
        for(Long address :addressId) {
            addressRepository.deleteById(address);
        }
        return " List of ID Deleted Successfully !";
    }



}

