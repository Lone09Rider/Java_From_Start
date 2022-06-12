package OOPs.Composition;

public class Processor {

	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cachMemory;
	private String frequency;
	private String MinFrequency;
	private String MaxFrequency;

	public Processor() {
		this.brand = "Intel";
		this.series = "i5 7200u";
		this.generation = 7;
		this.cores = 2;
		this.threads = 4;
		this.cachMemory = "3 MB";
		this.frequency = "2.5 GHz";
		MinFrequency = "2.5 GHz";
		MaxFrequency = "3.1 GHz";
	}

	public Processor(String brand, String series, int generation, int cores, int threads, String cachMemory,
			String frequency, String minFrequency, String maxFrequency) {
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cachMemory = cachMemory;
		this.frequency = frequency;
		MinFrequency = minFrequency;
		MaxFrequency = maxFrequency;
	}

	@Override
	public String toString() {
		return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
				+ ", threads=" + threads + ", cachMemory=" + cachMemory + ", frequency=" + frequency + ", MinFrequency="
				+ MinFrequency + ", MaxFrequency=" + MaxFrequency + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public int getGeneration() {
		return generation;
	}

	public void setGeneration(int generation) {
		this.generation = generation;
	}

	public int getCores() {
		return cores;
	}

	public void setCores(int cores) {
		this.cores = cores;
	}

	public int getThreads() {
		return threads;
	}

	public void setThreads(int threads) {
		this.threads = threads;
	}

	public String getCachMemory() {
		return cachMemory;
	}

	public void setCachMemory(String cachMemory) {
		this.cachMemory = cachMemory;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getMinFrequency() {
		return MinFrequency;
	}

	public void setMinFrequency(String minFrequency) {
		MinFrequency = minFrequency;
	}

	public String getMaxFrequency() {
		return MaxFrequency;
	}

	public void setMaxFrequency(String maxFrequency) {
		MaxFrequency = maxFrequency;
	}

}
