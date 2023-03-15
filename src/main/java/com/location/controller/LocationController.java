package com.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.internal.LoadingCache;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location.dto.LocationDataTranfer;
import com.location.entities.Locations;
import com.location.services.LocationService;
import com.location.util.EmailUtil;

@Controller
public class LocationController {
		@RequestMapping("/saveLocation")
		public String loadSaveLocationPage() {
			return "saveLocation";
		}
		@Autowired
		private EmailUtil email;
		@Autowired
		private LocationService locationservice;
		@RequestMapping("/saveLocationData")
		public String saveLocationData(@ModelAttribute("location") Locations location,ModelMap modelMap){
			locationservice.saveLocation(location);
			modelMap.addAttribute("msg", "Record is saved!!!");
			email.sendEmail("ramkore1998@gmail.com", "Hi Ram", "Record is saved!!!","");
			return "saveLocation";	
		}
			
//		@RequestMapping("/saveLocationData")
//		public String saveLocationData(@RequestParam("id") Long id,@RequestParam("codes") String codes,@RequestParam("name") String name,@RequestParam("type") String type,ModelMap modelMap){
//			Locations location=new Locations();
//			location.setId(id);
//			location.setCodes(codes);
//			location.setName(name);
//			location.setType(type);
//			locationservice.saveLocation(location);
//			modelMap.addAttribute("msg", "Record is saved!!!");
//			return "saveLocation";	
//		}

		
		
		
//		@RequestMapping("/saveLocationData")
//		public String saveLocationData(LocationDataTranfer locationdata ,ModelMap modelMap){
//			Locations location=new Locations();
//			location.setId(locationdata.getId());
//			location.setCodes(locationdata.getCodes());
//			location.setName(locationdata.getName());
//			location.setType(locationdata.getType());
//			locationservice.saveLocation(location);
//			modelMap.addAttribute("msg", "Record is saved!!!");
//			return "saveLocation";	
//		}

		
		@RequestMapping("/getLocations")
		public String getAllLocations(ModelMap modelMap) {
			List<Locations> locationData = locationservice.getLocationData();
			
			modelMap.addAttribute("searchResult", locationData);
			return "searchLocation";
			
		}
		
		
		@RequestMapping("/delete")
		public String deleteLocation(@RequestParam("id") long id, ModelMap modelMap) {
			locationservice.deleteLocation(id);
			
			List<Locations> locationData = locationservice.getLocationData();
			modelMap.addAttribute("searchResult", locationData);
			return "searchLocation";
			
		}
		
		@RequestMapping("/update")
		public String updateLocation(@RequestParam("id") long id, ModelMap modelMap) {
			Locations updateLocation = locationservice.updateLocation(id);
			
			
			modelMap.addAttribute("location", updateLocation);
			//modelMap.addAttribute("update","Record is Updated!!!");
			return "updateLocation";
			
		}
		@RequestMapping("/updateLocations")
		public String updateLocationData(LocationDataTranfer locationdata, ModelMap modelMap) {
			Locations location =new Locations();
			location.setId(locationdata.getId());
			location.setCodes(locationdata.getCodes());
			location.setName(locationdata.getName());
			location.setType(locationdata.getType());
			locationservice.saveLocation(location);
              List<Locations> locationData = locationservice.getLocationData();
			
			modelMap.addAttribute("searchResult", locationData);
			return "searchLocation";
		}
		
}
