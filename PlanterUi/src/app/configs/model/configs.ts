export class Configs {
    public name: string;
    public moistureStarter: number;
    public insolationStarter: number;
    public temperatureStarter: number;
  

    constructor(name: string, moistureStarter: number, insolationStarter: number, temperatureStarter: number) {
      this.name = name;
      this.moistureStarter = moistureStarter;
      this.insolationStarter = insolationStarter;
      this.temperatureStarter = temperatureStarter;
    }
    
    // getters and setters
    public getName(): string {
      return this.name;
    }
    
    public setName(name: string): void {
      this.name = name;
    }
    
    public getMoistureStarter(): number {
      return this.moistureStarter;
    }
    
    public setMoistureStarter(moistureStarter: number): void {
      this.moistureStarter = moistureStarter;
    }
    
    public getInsolationStarter(): number {
      return this.insolationStarter;
    }
    
    public setInsolationStarter(insolationStarter: number): void {
      this.insolationStarter = insolationStarter;
    }
    
    public getTemperatureStarter(): number {
      return this.temperatureStarter;
    }
    
    public setTemperatureStarter(temperatureStarter: number): void {
      this.temperatureStarter = temperatureStarter;
    }
  }
