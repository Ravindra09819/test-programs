using System;
using System.IO;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ASSIGNMENT1
{
    class Program
    {
        public class Team
        {
            public string name;
            public int mp, w, l, d, points;
            public Team(string name)
            {
                this.name = name;
                mp = 0;
                w = 0;
                l = 0;
                d = 0;
                points = 0;
            }
            public void add_mp() { this.mp += 1; }
            public void add_w() { this.w += 1; }
            public void add_l() { this.l += 1; }
            public void add_d() { this.d += 1; }
            public void calc_points()
            {
                this.points = this.w * 3 + this.d * 1;
                //Console.WriteLine("Points = "+points);
            }
            public void display()
            {
                Console.WriteLine($"{this.name,-25}|{this.mp,-3}|{this.w,-3}|{this.d,-3}|{this.l,-3}|{this.points,-6}");
            }
        }

        public static void Sort(Team[] t_obj)
        {
            Team t;
            for (int i = 0; i < t_obj.Length; i++)
            {
                for (int j = 0; j < t_obj.Length; j++)
                {
                    if (t_obj[i].points > t_obj[j].points)
                    {
                        t = t_obj[i];
                        t_obj[i] = t_obj[j];
                        t_obj[j] = t;
                    }
                    if (t_obj[i].points == t_obj[j].points)
                    {
                        if (String.Compare(t_obj[i].name, t_obj[j].name) < 0)
                        {
                            t = t_obj[i];
                            t_obj[i] = t_obj[j];
                            t_obj[j] = t;
                        }
                    }
                }
            }
        }
        static void Main(string[] args)
        {
            String path = @"\\192.168.2.1\msc fy\mscfy15\MSC15\dotnet\Lab Assignment\Assignment1\ASSIGNMENT1\tally.txt";
            String[] lines;
            String[,] tally = new String[10, 3];
            lines = File.ReadAllLines(path);
            for (int i = 0; i < lines.Length; i++)
            {
                String[] line = lines[i].Split(';');
                for (int j = 0; j < 3; j++)
                    tally[i, j] = line[j];
            }
            /*for (int i = 0; i < lines.Length; i++)
            {   Console.WriteLine(); 
                for (int j = 0; j < 3; j++)
                    Console.Write("  " + tally[i, j]);
            }*/
            string[] teams = new string[10];
            teams[0] = tally[0, 0];
            teams[1] = tally[0, 1];
            int counter = 1;
            int k;
            for (int i = 1; i < lines.Length; i++)
            {
                for (int j = 0; j < 2; j++)
                {
                    for (k = 0; k <= counter; k++)
                    {

                        if (teams[k] == tally[i, j])
                        {
                            break;
                        }

                        if (k == counter)
                        {
                            teams[counter + 1] = tally[i, j];
                            counter++;
                        }

                    }

                }

            }
            counter = counter + 1;
            /*Console.WriteLine();
            for(int i=0;i<counter;i++)
                Console.Write(teams[i]+ "  ");
            */
            Team[] t_obj = new Team[counter];
            for (int i = 0; i < t_obj.Length; i++)
            {
                t_obj[i] = new Team(teams[i]);
            }
            //Console.WriteLine(lines.Length);

            //Team 1
            for (int i = 0; i < lines.Length; i++)
            {
                for (int j = 0; j < t_obj.Length; j++)
                {
                    if (t_obj[j].name == tally[i, 0])
                    {
                        t_obj[j].add_mp();
                        if (tally[i, 2] == "win")
                        { t_obj[j].add_w(); }
                        if (tally[i, 2] == "loss")
                        { t_obj[j].add_l(); }
                        if (tally[i, 2] == "draw")
                        { t_obj[j].add_d(); }

                    }
                }

            }
            //Team 2
            for (int i = 0; i < lines.Length; i++)
            {
                for (int j = 0; j < t_obj.Length; j++)
                {
                    if (t_obj[j].name == tally[i, 1])
                    {
                        t_obj[j].add_mp();
                        if (tally[i, 2] == "win")
                        { t_obj[j].add_l(); }
                        if (tally[i, 2] == "loss")
                        { t_obj[j].add_w(); }
                        if (tally[i, 2] == "draw")
                        { t_obj[j].add_d(); }

                    }
                }

            }
            for (int i = 0; i < t_obj.Length; i++)
            {
                t_obj[i].calc_points();
            }
            Console.WriteLine("\n\nTally sorted according to points:\n");
            Sort(t_obj);
            Console.WriteLine("_________________________________________________");
            Console.WriteLine($"{"Team",-25}|{"MP",-3}|{"W",-3}|{"D",-3}|{"L",-3}|{"Points",-6}");
            Console.WriteLine("_________________________________________________");
            for (int i = 0; i < t_obj.Length; i++)
                t_obj[i].display();

            Console.ReadKey();
        }
    }
}
