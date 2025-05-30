package ca.sheridancollege.smartwaste.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ca.sheridancollege.smartwaste.beans.Sensor;

@Service
public interface SensorService {

	public List<Sensor> findAll();
	public Sensor findById(Long id);
	public Sensor findByMacAddress(String macAddress);
	public Sensor save(Sensor sensor); 
	public Sensor update(Long id, Sensor updatedSensor);
	public void delete(Long id);

}
