#include <stdlib.h>
#include <stdio.h>
#include <String.h>
#include "utils.h"

int main(int argc, char* argv[])
{
    char *refStr, * tolStr, *hitStr;
    float v;
    refStr = tolStr = hitStr = NULL;
    int ind;
    for(ind = 1; ind < argc; ind++)
    {
        if(strcmp(argv[ind], "-r") == 0) {refStr = argv[ind+1]; ind++;}
        if(strcmp(argv[ind], "-t") == 0) {tolStr = argv[ind+1]; ind++;}
        if(strcmp(argv[ind], "-v") == 0) {v = 1;}
    }

    if(refStr == NULL || tolStr == NULL)
    {
        fprintf(stderr, "Usage: %s -r ref -t tol\n", argv[0]);
        exit(1);
    }

    struct tm *local;
    time_t start,end;

    float ref = strtof(refStr, 0);
    float tol = strtof(tolStr, 0);
    if(tol < 0.0)
    tol *= -1;

    int rct,cct;
    fscanf(stdin, "%d", &rct);
    fscanf(stdin, "%d", &cct);

    float** rows = (float **) malloc(rct * sizeof(float *));
    if(rows == 0)
    {
        fprintf(stderr, "couldn't alocate sufficient space.\n");
        exit(1);
    }
    int i;
    for(i = 0; i < rct; i++)
    {
        float * row = (float *) malloc(cct * sizeof(float));
        if(row == 0)
        {
            fprintf(stderr, "Couldn't alocate sufficient row space\n");
            exit(1);
        }
        rows[i] = row;
    }

    int r,c;
    for(r = 0; r < rct;r++)
    for(c = 0; c < cct;c++)
    fscanf(stdin, "%f", &rows[r][c]);

    time(&start);
    local = localtime(&start);
    printf("# Start time and date: %s", asctime(local));

    int count = 0;

    for(r = 0; r < rct; r++)
    {
        for(c = 0; c < cct; c++)
        {
            if(approxEqual(rows[r][c],ref,tol) == 1)
            {
                fprintf(stdout, "r=%d, c=%d: %.6f\n",r,c ,rows[r][c]);
                count++;
            }
        }
    }

    fprintf(stdout, "Found %d approximate matches.\n", count);
    printf("# End time and date: %s",asctime(local));

    exit(0);
}