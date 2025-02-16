
/*
                INHERITANCE

    Syntax:
        class Derived : access-specifier Base {
            // class members
        };

        Example:
            class Student : public Person {
                // class members
            };
        

    1. Inheritance Types
        a. Single Inheritance
        b. Multiple Inheritance
        c. Multilevel Inheritance
        d. Hierarchical Inheritance
        e. Hybrid Inheritance

    2. Public, Protected, Private Inheritance
        A. Public Inheritance

            class Base {
                public:
                    int x;
                protected:
                    int y;
                private:
                    int z;
            };

            class Derived : public Base {
                // x is public
                // y is protected
                // z is not accessible
            };

        B. Protected Inheritance

            class Base {
                public:
                    int x;
                protected:
                    int y;
                private:
                    int z;
            };

            class Derived : protected Base {
                // x is protected
                // y is protected
                // z is not accessible
            };

        C. Private Inheritance
        
            class Base {
                public:
                    int x;
                protected:
                    int y;
                private:
                    int z;
            };

            class Derived : private Base {
                // x is private
                // y is private
                // z is not accessible
            };
*/