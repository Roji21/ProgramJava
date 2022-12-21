/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nbasu
 */
public class NewClass {

    public class cat {

        private double _hungry;
        protected double _mood;
        public double _energy;

        private function meow() {
            return "meow...!";
        }

        private function sleep() {
            this
            ->_hungry++;
            this
            ->_energy++;
        }

        private function fedd() {
            this
            ->_hungry--;
            this
            ->_mood++;
            this
            ->meow();
        }
    }

    public class human {

        var cat = new cat();
        cat
        ->_energy
        ++;
        cat

        ->sleep();
    }

    public class persiacat 
    : cat

    {
        public persiacat(){
            this->_mood++;
            this->feed();
            this->_energy--;
            this->sleep();
        }
    }
}
