//
// Created by admin on 2022/7/4.
//

#ifndef SERIALPORTLIB_SERIAL_PORT_H
#define SERIALPORTLIB_SERIAL_PORT_H


namespace conn {


class serial_port_t {

public:
    serial_port_t(int fd);
    ~serial_port_t();

    static bool open(const char *name, int baudrate, int &fd);

    int read(void *buf, int size) const;

    int write(void *buf, int size) const;

private:
    static bool set_attr(int fd, int baudrate);

private:
    int m_fd;
};


}

#endif //SERIALPORTLIB_SERIAL_PORT_H
