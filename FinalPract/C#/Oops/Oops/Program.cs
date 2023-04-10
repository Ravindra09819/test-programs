using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Oops
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Vehicle vehicle = new Cars();
            Cars cars = new Cars();

            cars.Start();
            vehicle.Start();
            cars.Stop();
            vehicle.Stop();
            cars.Horn();
            vehicle.Horn();

            Console.ReadKey();
        }
    }

    public interface IVehicle {
        void Start();
        void Stop();
        void Horn();

    }

    public class Vehicle : IVehicle {

        public Vehicle() {
            Console.WriteLine("Default Vehicle constructor.");
        }
        public virtual void Start() {
            Console.WriteLine("Vehicle Started.");
        }
        public virtual void Stop()
        {
            Console.WriteLine("Vehicle Stopped.");
        }

        public void Horn() { 
            Console.WriteLine("Vehicle type don't know.");
        }
    }

    public class Cars: Vehicle {

        public Cars() {
            Console.WriteLine("Default Cars Constructor.");
        }
        public override void Start() {
            Console.WriteLine("Car Started.");
        }

        public new void Horn() {
            Console.WriteLine("Car Honking.");
        }
    }
}
