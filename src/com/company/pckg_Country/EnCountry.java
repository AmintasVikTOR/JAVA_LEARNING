package com.company.pckg_Country;

public enum EnCountry implements Iadd_info {
    Belarus {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }

    },
    Russia {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    China {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    Egypt {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    Poland {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    Australia {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    USA {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    Canada {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    India {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    },
    France {
        @Override
        public void add_info(Double sq, int cnt) {
            this.sq=sq;
            this.cnt=cnt;
        }
    }
    ;

    Double sq;
    int cnt;

    public void print() {
        this.sq=sq;
        this.cnt=cnt;
        System.out.print(valueOf(name())+". ");

        System.out.println("Площадь:"+sq+"; Количество: "+cnt);
    }

    public int get_info_counts (int cnt)
    {
        return this.cnt=cnt;
    }


}
